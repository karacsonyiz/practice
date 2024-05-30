package server.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  long totalPrice;
    private String date;
    private  int month;
    private OrderStatus status;
    private  String productName;
    private  long productCount;
    private  long productPrice;

    public Report(long id, String productName,int month,long productCount,long productPrice,long totalPrice) {
        this.id = id;
        this.month = month;
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
    }

    public Report(long id, long totalPrice, String date, int month, OrderStatus status, String productName, long productCount, long productPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.date = date;
        this.month = month;
        this.status = status;
        this.productName = productName;
        this.productCount = productCount;
        this.productPrice = productPrice;
    }

    public Report() {
    }

    public long getId() {
        return id;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductCount() {
        return productCount;
    }

    public long getProductPrice() {
        return productPrice;
    }
}
