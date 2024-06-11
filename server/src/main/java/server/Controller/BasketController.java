package server.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.Entity.Basket;
import server.Response.ResponseText;
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
    public long addBasket(@RequestBody Basket basket) {
        return basketService.addBasket(basket);
    }

    @RequestMapping("/basket/delete/{id}")
    public Long deleteBasket(@PathVariable Long id){
        return basketService.deleteBasket(id);
    }

    @RequestMapping("/basket/update/{id}")
    public ResponseEntity<ResponseText> updateBasket(@RequestBody Basket basket, @PathVariable Long id){
        return basketService.updateBasket(id,basket);
    }

}
