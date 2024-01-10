package server.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.Basket;
import server.Service.BasketService;

@RestController
public class BasketController {

    private BasketService basketService;

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

    @RequestMapping("/createbasket")
    public long addBasket(Basket basket) {
        return basketService.addBasket(basket);
    }
}
