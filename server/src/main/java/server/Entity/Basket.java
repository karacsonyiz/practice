package server.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Access(value= AccessType.FIELD)
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long userId;
    private long bookId;
}
