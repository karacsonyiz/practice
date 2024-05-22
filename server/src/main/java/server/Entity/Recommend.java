package server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Recommend {

    @Id
    @GeneratedValue
    private int id;
    private int bookId;

}
