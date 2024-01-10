package server.Service;


import org.springframework.stereotype.Service;
import server.Database.BasketRepository;
import server.Entity.Basket;

import java.util.Optional;

@Service
public class BasketService {

    private BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public Optional<Basket> getBasketById(Long id){
        return basketRepository.findById(id);
    }

    public long addBasket(Basket basket) {
        basketRepository.save(basket);
        return basket.getId();
    }
}
