package server.Service;

import org.springframework.stereotype.Service;
import server.Database.OrderRepository;
import server.Entity.Order;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

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
}
