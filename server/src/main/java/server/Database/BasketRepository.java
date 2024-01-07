package server.Database;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.Entity.Basket;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {}
