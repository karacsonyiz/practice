package server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    private final long totalPrice;
    private String date;
    private final int month;
    private OrderStatus status;
    private final String productName;
    private final long productCount;
    private final long productPrice;

    public Report(long id, String productName,int month,long productCount,long productPrice,long totalPrice) {
        this.id = id;
        this.month = month;
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
    }
}
