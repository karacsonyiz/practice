package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private final List<Ship> ships = new ArrayList<>();
    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void lift(int passengers, int cargoWeight) {
        for(Ship ship : ships) {
            if(ship instanceof CanCarryGoods) {
                cargoWeight = ((CanCarryGoods) ship).loadCargo(cargoWeight);
            }
            if(ship instanceof CanCarryPassengers) {
                passengers = ((CanCarryPassengers) ship).loadPassenger(passengers);
            }
        }
        waitingPersons = passengers;
        waitingCargo = cargoWeight;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
