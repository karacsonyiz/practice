package server.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.Entity.Order;

@Repository
public interface OrderItemRepository extends JpaRepository<Order, Long> {}
