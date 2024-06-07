package server.Controller;

import org.springframework.web.bind.annotation.*;
import server.Entity.Basket;
import server.Service.BasketService;

@RestController
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @RequestMapping("/basket/{id}")
    public Basket getBasket(@PathVariable Long id){
        if(basketService.getBasketById(id).isPresent()){
            return basketService.getBasketById(id).get();
        }
        return null;
    }

    @RequestMapping("/createbasket/{id}")
    public long addBasket(@PathVariable Long id) {
        System.out.println(id);
        return basketService.addBasket(id);
    }

    @RequestMapping(value = "/createbasket", method = RequestMethod.POST)
    public long createBasket(@RequestBody Basket basket) {
        return basketService.createBasket(basket);
    }
}
