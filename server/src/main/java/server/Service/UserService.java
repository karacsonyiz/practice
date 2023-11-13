package server.Service;

import org.springframework.stereotype.Service;
import server.Database.UserRepository;
import server.Entity.User;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }
}
