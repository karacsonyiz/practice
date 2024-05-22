package server.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Access(value= AccessType.FIELD)
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int ratingScore;
    private String ratingText;
    private LocalDateTime ratingDate;
    private User user;
    private boolean canEditOrDelete;
}
