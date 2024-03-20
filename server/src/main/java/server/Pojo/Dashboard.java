package server.Pojo;


import lombok.Data;

@Data
public class Dashboard {

    private long userCount;
    private long bookCount;
    private long activeOrderCount;
    private long orderCount;

    public Dashboard(long userCount, long bookCount, long activeOrderCount, long orderCount) {
        this.userCount = userCount;
        this.bookCount = bookCount;
        this.activeOrderCount = activeOrderCount;
        this.orderCount = orderCount;
    }

    public Dashboard(long userCount, long bookCount) {
        this.userCount = userCount;
        this.bookCount = bookCount;
    }

    public Dashboard() {
    }
}
