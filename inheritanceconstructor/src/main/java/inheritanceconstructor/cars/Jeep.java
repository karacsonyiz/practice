package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {

    }

    public void drive(int km) {
        double fuelUsed = ((double) km/100) * super.getFuelRate();
        if(fuelUsed > this.extraFuel + super.getFuel()) {
            throw new RuntimeException("Not enough fuel available!");
        }
        super.setFuel(((this.extraFuel + super.getFuel()) - fuelUsed));
        if(fuelUsed > extraFuel){
          this.extraFuel = 0;
        }
    }

    @Override
    public double calculateRefillAmount() {
        return (tankCapacity + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
