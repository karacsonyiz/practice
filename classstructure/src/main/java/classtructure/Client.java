package classtructure;

import java.time.LocalDate;

public class Client {

    private String name;
    private LocalDate dateOfBirth;
    private String address;

    public Client(String name,LocalDate dateOfBirth,String address){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this. address = address;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void migrate(String address){
        this.address = address;
    }

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2010, 1, 1);
        Client client = new Client("Joe",dateOfBirth,"New York, 5th. avenue 192");
        System.out.println(client.getName());
        System.out.println(client.getDateOfBirth());
        System.out.println(client.getAddress());
        client.migrate("Pennsylvania, Corner street 7");
        System.out.println(client.getAddress());
    }

}
