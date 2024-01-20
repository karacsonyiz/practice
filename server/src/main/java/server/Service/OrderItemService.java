package server.Service;


import org.springframework.stereotype.Service;
import server.Database.OrderItemRepository;
import server.Entity.OrderItem;

import java.util.List;

@Service
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }
}
