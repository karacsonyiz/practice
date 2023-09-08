package activity;

public class TrackPoint {

    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint point){
        return org.apache.lucene.util.SloppyMath.haversinMeters(
                point.getCoordinate().getLatitude(),
                point.getCoordinate().getLongitude(),
                coordinate.getLatitude(),
                coordinate.getLongitude());
    }


    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    @Override
    public String toString() {
        return "TrackPoint{" +
                "coordinate=" + coordinate +
                ", elevation=" + elevation +
                '}';
    }
}
