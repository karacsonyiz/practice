package server.Pojo;

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

    public long getUserCount() {
        return userCount;
    }

    public void setUserCount(long userCount) {
        this.userCount = userCount;
    }

    public long getBookCount() {
        return bookCount;
    }

    public void setBookCount(long bookCount) {
        this.bookCount = bookCount;
    }

    public long getActiveOrderCount() {
        return activeOrderCount;
    }

    public void setActiveOrderCount(long activeOrderCount) {
        this.activeOrderCount = activeOrderCount;
    }

    public long getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(long orderCount) {
        this.orderCount = orderCount;
    }
}
