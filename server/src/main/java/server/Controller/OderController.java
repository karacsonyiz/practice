package server.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.Order;
import server.Service.OrderService;

import java.util.List;

@RestController
public class OderController {

    private OrderService orderService;

    public OderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
}
