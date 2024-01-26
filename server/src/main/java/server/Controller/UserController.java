package server.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Entity.User;
import server.Service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

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

    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public long createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
