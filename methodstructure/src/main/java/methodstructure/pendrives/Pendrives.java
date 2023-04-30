package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive bestPendrive = pendrives.get(0);
        for(Pendrive pendrive : pendrives){
           if(pendrive.comparePricePerCapacity(bestPendrive) == -1){
               bestPendrive = pendrive;
           }
        }
        return bestPendrive;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapestPendrive = pendrives.get(0);
        for(Pendrive pendrive : pendrives){
            if(pendrive.cheaperThan(cheapestPendrive)){
                cheapestPendrive = pendrive;
            }
        }
        return cheapestPendrive;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for(Pendrive pendrive : pendrives) {
            if(pendrive.getCapacity() == capacity){
                pendrive.risePrice(percent);
            }
        }
    }
}
