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


    @Test
    public void testListUsers() {
        List<User> users1 = userService.listUsers();

        assertEquals(users1.size(), 2);
    }

    @Test
    public void testCreateUsers() {
        List<User> users1 = userController.listUsers();

        userController.createUser(new User("user2", "user2", "user2@gmail.com", 1, UserRole.ROLE_USER.name()));
        List<User> users2 = userController.listUsers();

        assertEquals(users1.size(), 3);
        assertEquals(users2.size(), 4);
    }

    @Test
    public void testDeleteUser() {
        userController.createUser(new User("user3", "user3", "user3@gmail.com", 1, UserRole.ROLE_USER.name()));        List<User> users1 = userController.listUsers();

        assertEquals(users1.size(), 5);

        User users3 = userController.listUsers().get(5);
        userService.deleteUser(users3);
        List<User> users2 = userController.listUsers();

        assertEquals(users2.size(), 4);
    }

    public void testGetUser(){
        User user = userService.getUser(1);
        assertEquals(user.getName(), "admin");
    }

    public void testUpdateUser() {
        List<User> users1 = userController.listUsers();

        User userToUpdate = users1.get(1);
        userController.updateUser(new User("user4", "user4", "user4@gmail.com", 1, UserRole.ROLE_USER.name()),userToUpdate.getId());
        assertEquals(userToUpdate.getName(), "user4");
    }
}
