package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public int numberOfTrackActivities(){
        int sum = 0;
        for(Activity activity : activities){
            if(activity instanceof ActivityWithTrack){
                sum += 1;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities(){
        int sum = 0;
        for(Activity activity : activities){
            if(activity instanceof ActivityWithoutTrack){
                sum += 1;
            }
        }
        return sum;
    }

    public List<Report> distancesByTypes(){
        List<Report> result = new ArrayList<>();
        for(Activity activity : activities){
            result.add(new Report(activity.getType(),activity.getDistance()));
        }
        return result;
    }
}
