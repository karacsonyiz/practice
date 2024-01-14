package server.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
