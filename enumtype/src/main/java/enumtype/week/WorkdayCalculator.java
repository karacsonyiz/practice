package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays){
        List<DayType> result = new ArrayList<>();
        for(int i = 0;i<numberOfDays;i++){
            Day currentDay = nextDay(firstDay);
            result.add(currentDay.getType());
            firstDay = currentDay;
        }
        return result;
    }

    private Day nextDay(Day day){
        int next = day.ordinal() == 6 ? 0 : day.ordinal()+1;
        return Day.values()[next];
    }
}
