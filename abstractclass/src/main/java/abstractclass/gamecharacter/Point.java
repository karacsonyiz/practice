package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point point){
        long distBetweenX = point.getX() - this.getX();
        long distBetweenY = point.getY() - this.getY();
        return (long) Math.sqrt((distBetweenY * distBetweenY) + (distBetweenX * distBetweenX));
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}
