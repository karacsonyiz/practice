package server.Service;

import org.springframework.stereotype.Service;
import server.Pojo.Dashboard;

@Service
public class DashboardService {

    private UserService userService;
    private BookService bookService;

    public Dashboard createDashboard() {
        return new Dashboard(userService.listUsers().size(),bookService.listBooks().size());
    }
}
