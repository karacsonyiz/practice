package server.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.OrderItem;
import server.Service.OrderItemService;

import java.util.List;

@RestController
public class OderItemController {

    private final OrderItemService orderItemService;

    public OderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @RequestMapping("/orderitems")
    public List<OrderItem> getOrderItems() {
        return orderItemService.getOrderItems();
    }
}
