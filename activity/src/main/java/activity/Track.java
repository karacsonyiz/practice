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
            currentElevation = track.getElevation();
            System.out.println(track.toString());
            if(track.getElevation() > currentElevation){
                totalElevation += track.getElevation() - currentElevation;
                //totalElevation += currentElevation -  track.getElevation();
            }
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


}
