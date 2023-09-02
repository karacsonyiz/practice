package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        checkIfCoordinatesAreValid(latitude,longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void checkIfCoordinatesAreValid(double lat, double lon){
        if(lat > 180 || lat < -180) {
            throw new IllegalArgumentException();
        }
        if(lon > 90 || lon < -90) {
            throw new IllegalArgumentException();
        }
    }
}
