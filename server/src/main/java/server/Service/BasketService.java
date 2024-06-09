package server.Service;


import org.springframework.stereotype.Service;
import server.Database.BasketRepository;
import server.Database.BookRepository;
import server.Database.UserRepository;
import server.Entity.Basket;
import server.Entity.Book;

import java.util.Optional;

@Service
public class BasketService {

    private final BasketRepository basketRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public Optional<Basket> getBasketById(Long id){
        return basketRepository.findById(id);
    }

    public long addBasket(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        Basket basket = new Basket();
        basket.setBookId(id);
        basketRepository.save(basket);
        return basket.getId();
    }

}
