package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import server.Database.UserRepository;
import server.Entity.Response;
import server.Entity.User;
import server.Entity.UserRole;
import server.Response.ResponseText;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

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
        LOGGER.info("User Created with id : " + user.getId());
        return userRepository.save(createdUser).getId();
    }

    public Response deleteUser(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        LOGGER.info("User Deleted with id : " + user.getId());
        return new Response(true,"User " + user.getId() + " has been deleted");
    }

    public User getUser(long id) {
        if(userRepository.findById(id).isPresent()){
            return userRepository.findById(id).get();
        }
        return null;
    }

    public ResponseEntity<ResponseText> updateUser(User user, long id) {
        if(userRepository.findById(id).isPresent()){
            User userToSave = userRepository.findById(id).get();
            userToSave.setName(user.getName());
            userToSave.setEmail(user.getEmail());
            userToSave.setPassword(user.getPassword());
            userToSave.setEnabled(user.getEnabled());
            userToSave.setRole(user.getRole());
            userRepository.save(userToSave);
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
