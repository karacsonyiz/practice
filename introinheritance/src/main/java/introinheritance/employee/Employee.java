package introinheritance.employee;

public class Employee extends Person {

    private double salary;

    private static final double LEADERSHIP_FACTOR = 0.1;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        this.salary = this.salary + (this.salary * ((double) percent/100));
    }

    public static double getLEADERSHIP_FACTOR() {
        return LEADERSHIP_FACTOR;
    }
}
