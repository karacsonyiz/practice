package server.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import server.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
