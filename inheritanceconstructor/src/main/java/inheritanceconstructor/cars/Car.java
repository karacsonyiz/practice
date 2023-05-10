package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if(fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;

    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel = this.fuel + fuel;
    }
    public void drive(int km) {
        if((this.fuel - ((this.fuelRate * km) / 100)) < 0) {
            throw new RuntimeException("Not enough fuel available!");
        }
        this.fuel = this.fuel - ((this.fuelRate * km) / 100);
    }

    public double calculateRefillAmount() {
        return this.tankCapacity - this.fuel;
    }

}
