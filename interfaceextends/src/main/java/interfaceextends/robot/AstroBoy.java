package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;
    private long altitude;

    public AstroBoy(Point position) {
        this.position = position;
    }

    @Override
    public void liftTo(long altitude) {
        this.altitude = altitude;
    }

    @Override
    public void moveTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        path.add(new Point(this.position.getX(),this.position.getY(),ALTITUDE));
        path.add(new Point(position.getX(),position.getY(),ALTITUDE));
        path.add(new Point(position.getX(),position.getY(),0));
        this.position = position;
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return this.path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return this.altitude;
    }


}
