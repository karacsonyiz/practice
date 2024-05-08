package server.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.Entity.Recommend;

@Repository
public interface RecommendRepository extends JpaRepository<Recommend, Integer> { }
