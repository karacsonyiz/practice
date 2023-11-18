package server.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.User;
import server.Service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public List<User> listUsers() {
        return userService.listUsers();
    }


    @RequestMapping("/principal")
    public Principal retrievePrincipal(Principal principal) {
        return principal;
    }
}
