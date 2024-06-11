package server.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import server.Database.BasketRepository;
import server.Database.BookRepository;
import server.Database.UserRepository;
import server.Entity.Basket;

import java.util.Optional;

@Service
public class BasketService {

    private final BasketRepository basketRepository;

    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public Optional<Basket> getBasketById(Long id){
        return basketRepository.findById(id);
    }

    public long addBasket(Basket basket) {
        basketRepository.save(basket);
        LOGGER.info("Basket Created with id : " + basket.getId());
        return basket.getId();
    }

    public Long deleteBasket(Long id){
        basketRepository.deleteById(id);
        LOGGER.info("Book Deleted with id : " + id);
        return id;
    }
}
