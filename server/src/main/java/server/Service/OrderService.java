package server.Service;

import org.springframework.stereotype.Service;
import server.Database.OrderRepository;
import server.Entity.Book;
import server.Entity.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public long createOrder(Order order) {
        orderRepository.save(order);
        return order.getId();
    }

    public Optional<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }


    public Long deleteOrder(Long id){
        orderRepository.deleteById(id);
        return id;
    }
}
