package activity;

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
                currentElevation = track.getElevation();
                System.out.println(totalElevation);
                totalElevation += currentElevation -  track.getElevation();
            }
        }
        System.out.println(totalElevation);
        return totalElevation;

    }
}
