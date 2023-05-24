package virtualmethod.vehicle;

public class Car extends Vehicle {

    private int numberOfPassenger;

    public Car(int vehicleWeight, int numberPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberPassenger;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + (numberOfPassenger * Car.PERSON_AVERAGE_WEIGHT);
    }

    @Override
    public int getVehicleWeight() {
        return super.getVehicleWeight();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger + "," + " vehicleWeight=" + getVehicleWeight() +
                '}';
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
