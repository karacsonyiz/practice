package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import server.Database.OrderRepository;
import server.Entity.Order;
import server.Response.ResponseText;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

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

    public ResponseEntity<ResponseText> updateOrder(Long id, Order order){
        if(orderRepository.findById(id).isPresent()){
            Order orderToSave = orderRepository.findById(id).get();
            orderToSave.setUserId(order.getUserId());
            orderToSave.setDate(order.getDate());
            orderToSave.setStatus(order.getStatus());
            orderToSave.setDeliveryAddress(order.getDeliveryAddress());
            orderRepository.save(orderToSave);
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        LOGGER.info("Order Modified with id : " + id);
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
