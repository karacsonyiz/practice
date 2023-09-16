package activity;

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
        return 0;
    }

    public List<Report> distancesByTypes(){
        return null;
    }
}
