package server.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import server.Database.UserRepository;
import server.Entity.Response;
import server.Entity.User;
import server.Entity.UserRole;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public long createUser(User user){
        User createdUser = new User(user.getName(),passwordEncoder().encode(user.getPassword()),
                user.getEmail(),1, UserRole.ROLE_USER.name());
        return userRepository.save(createdUser).getId();
    }

    public Response deleteUser(User user) {
        userRepository.delete(user);
        return new Response(true,"User " + user.getId() + " has been deleted");
    }

    public User getUser(long id) {
        if(userRepository.findById(id).isPresent()){
            return userRepository.findById(id).get();
        }
        return null;
    }

    public long updateUser(User user, long id) {
        User userToUpdate = new User(id, user.getName(),user.getPassword(),user.getEmail(),1, user.getRole());
        return userRepository.save(userToUpdate).getId();
    }
}
