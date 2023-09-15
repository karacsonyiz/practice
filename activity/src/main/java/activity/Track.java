package activity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public double getFullElevation(){

        double totalElevation = 0;
        double currentElevation = trackPoints.get(0).getElevation();


        for(TrackPoint track : trackPoints){
            if(track.getElevation() > currentElevation){
                totalElevation += track.getElevation() - currentElevation;
            }
            currentElevation = track.getElevation();

        }
        System.out.println(totalElevation);
        return totalElevation;
    }

    public double getDistance(){

        double fullDistance = 0;
        TrackPoint currentTrackpoint = trackPoints.get(0);
        for(int i = 1;i<trackPoints.size();i++){
            fullDistance += trackPoints.get(i).getDistanceFrom(currentTrackpoint);
            currentTrackpoint = trackPoints.get(i);
        }
        return fullDistance;
    }

    public Coordinate findMinimumCoordinate(){
        Coordinate minCoordinate = new Coordinate(0,0);
        for(TrackPoint trackPoint : trackPoints){
            if(trackPoint.getCoordinate().getLatitude() < minCoordinate.getLatitude()){
                minCoordinate.setLatitude(trackPoint.getCoordinate().getLatitude());
            }
            if(trackPoint.getCoordinate().getLongitude() < minCoordinate.getLongitude()){
                minCoordinate.setLongitude(trackPoint.getCoordinate().getLongitude());
            }
        }

        return minCoordinate;
    }

    public Coordinate findMaximumCoordinate(){
        Coordinate maxCoordinate = new Coordinate(0,0);
        for(TrackPoint trackPoint : trackPoints){
            if(trackPoint.getCoordinate().getLatitude() > maxCoordinate.getLatitude()){
                maxCoordinate.setLatitude(trackPoint.getCoordinate().getLatitude());
            }
            if(trackPoint.getCoordinate().getLongitude() > maxCoordinate.getLongitude()){
                maxCoordinate.setLongitude(trackPoint.getCoordinate().getLongitude());
            }
        }

        return maxCoordinate;
    }

    public double getFullDecrease(){
        double totalDecrease = 0;
        double currentDecrease = trackPoints.get(0).getElevation();

        for(TrackPoint track : trackPoints){
            if(track.getElevation() < currentDecrease){
                totalDecrease += currentDecrease - track.getElevation();
            }
            currentDecrease = track.getElevation();

        }
        System.out.println(totalDecrease);
        return totalDecrease;
    }

}
