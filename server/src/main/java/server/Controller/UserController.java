package server.Controller;

import org.springframework.web.bind.annotation.*;
import server.Entity.Response;
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

    @RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
    public Response deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

}
