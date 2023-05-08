package introinheritance.employee;

public class Boss extends Employee {

    private final int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary(){
        return ((numberOfEmployees * super.getSalary() * Employee.getLEADERSHIP_FACTOR()) + super.getSalary());
    }
}
