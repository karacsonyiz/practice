package solid.base;

import java.util.List;

public class UserController {

    private final UserService userService;
    private final List<Validator> validators;

    public UserController(UserService userService, List<Validator> validators) {
        this.userService = userService;
        this.validators = validators;
    }

    public void createUser(String username) {
        if(validUserName(username)) {
            userService.save(new User(username));
        }
    }

    private boolean validUserName(String userName) {
        for(Validator validator : validators) {
            if(!validator.isValid(userName)) {
                return false;
            }
        }
        return true;
    }

}
