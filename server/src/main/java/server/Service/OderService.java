package server.Service;

import server.Database.OrderRepository;
import server.Entity.Order;

import java.util.List;

public class OderService {

    private OrderRepository orderRepository;

    public OderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
