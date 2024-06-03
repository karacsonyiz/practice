package server.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.Entity.Book;
import server.Entity.Order;
import server.Response.ResponseText;
import server.Service.OrderService;

import java.util.List;

@RestController
public class OderController {

    private final OrderService orderService;

    public OderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @RequestMapping(value = "/createorder", method = RequestMethod.POST)
    public long createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @RequestMapping("/order/{id}")
    public Order getOrderbyId(@PathVariable Long id){
        if(orderService.getOrderById(id).isPresent()){
            return orderService.getOrderById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/deleteorder", method = RequestMethod.POST)
    public long deleteOrder(@PathVariable Long id) {
        return orderService.deleteOrder(id);
    }

    @RequestMapping("/order/update/{id}")
    public ResponseEntity<ResponseText> updateOrder(@RequestBody Order order, @PathVariable Long id){
        return orderService.updateOrder(id,order);
    }
}
