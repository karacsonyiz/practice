package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {

    public final int MAX_CARRY_WEIGHT;
    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
        this.MAX_CARRY_WEIGHT = vehicleWeight;
    }

    public boolean canCarry(Car car) {
        if(car.getVehicleWeight() < MAX_CARRY_WEIGHT) {
            return true;
        }
        return false;
    }

    public boolean load(Car car) {
        if(canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public int getGrossLoad() {
        if(car != null) {
            return super.getGrossLoad() + this.car.getGrossLoad();
        }
        return super.getGrossLoad();
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
