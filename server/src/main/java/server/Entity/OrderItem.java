package server.Entity;

import jakarta.persistence.Entity;

@Entity
public class OrderItem {

    private long id;
    private long orderId;
    private long bookId;
    private long bookPrice;

    public OrderItem(long id, long orderId, long bookId, long bookPrice) {
        this.id = id;
        this.orderId = orderId;
        this.bookId = bookId;
        this.bookPrice = bookPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(long bookPrice) {
        this.bookPrice = bookPrice;
    }
}
