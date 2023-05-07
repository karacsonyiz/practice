package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;

    }
    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for(int i = firstHour;i < lastHour+1; i++){
            this.timeTable.add(new SimpleTime(i,everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        SimpleTime nextbus = null;
        int actualInMinutes = (actual.getHours() * 60) + actual.getMinutes();
        for(SimpleTime bus : timeTable){
            int timeInMinutes = (bus.getHours() * 60) + bus.getMinutes();
            if(actualInMinutes < timeInMinutes){
                nextbus = bus;
                break;
            }
        }
        checkIfNoNextBus(nextbus);
        return nextbus;
    }

    private void checkIfNoNextBus(SimpleTime nextbus){
        if(nextbus == null){
            throw new IllegalStateException("No more buses today!");
        }
    }
}
