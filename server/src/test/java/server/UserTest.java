package server;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.Controller.UserController;
import server.Entity.User;
import server.Entity.UserRole;
import server.Service.UserService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserController userController;

    @Autowired
    private UserService userService;

    @Before
    public void init() {
        userService.createUser(new User(1,"admin","admin","admin@gmail.com",1, UserRole.ROLE_ADMIN.name()));
        userService.createUser(new User(2,"user","user","user@gmail.com",1, UserRole.ROLE_USER.name()));
    }
}
