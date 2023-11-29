package server.Entity;


import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String email;
    private int enabled;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.ROLE_USER;

    public User() {
    }

    public User(String name, String password,String email, int enabled, String role) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.role = UserRole.valueOf(role);
    }

    public User(long id, String name, String password,String email, int enabled, String role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.role = UserRole.valueOf(role);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }


    public String getRole() {
        return role.name();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = UserRole.valueOf(role);
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
