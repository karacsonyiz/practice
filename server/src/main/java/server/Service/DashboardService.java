package server.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.Database.OrderRepository;
import server.Pojo.Dashboard;

@Service
public class DashboardService {

    @Autowired
    private final UserService userService;
    private final BookService bookService;
    private final OrderRepository orderRepository;

    public DashboardService(UserService userService, BookService bookService,OrderRepository orderRepository) {
        this.userService = userService;
        this.bookService = bookService;
        this.orderRepository = orderRepository;
    }

    public Dashboard createDashboard() {
        return new Dashboard(userService.listUsers().size(),bookService.listBooks().size());
    }

    public Dashboard createDashboardWithOrderCount(){
        return new Dashboard(userService.listUsers().size(),bookService.listBooks().size(),1,orderRepository.count());
    }

}
