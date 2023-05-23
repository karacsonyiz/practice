package solid.base;

public class User {

    private final String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return userName;
    }
}
