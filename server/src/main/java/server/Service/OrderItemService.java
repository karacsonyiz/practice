package server.Service;


import org.springframework.stereotype.Service;
import server.Database.OrderItemRepository;
import server.Entity.Order;

import java.util.List;

@Service
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<Order> getOrderItems() {
        return orderItemRepository.findAll();
    }
}
