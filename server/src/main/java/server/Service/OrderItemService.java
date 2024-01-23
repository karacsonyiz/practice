package server.Service;


import org.springframework.stereotype.Service;
import server.Database.OrderItemRepository;
import server.Entity.Order;
import server.Entity.OrderItem;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getOrderItems() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(Long id){
        return orderItemRepository.findById(id);
    }

    public Long deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
        return id;
    }
}
