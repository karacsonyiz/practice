package introinheritance.employee;

public class Person {

    private final String name;
    private String address;



    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void migrate(String newAddress) {
        this.address = newAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
