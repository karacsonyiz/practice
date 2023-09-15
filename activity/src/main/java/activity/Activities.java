package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public int numberOfTrackActivities(){
        return 0;
    }

    public int numberOfWithoutTrackActivities(){
        return 0;
    }

    public List<Report> distancesByTypes(){
        return null;
    }
}
