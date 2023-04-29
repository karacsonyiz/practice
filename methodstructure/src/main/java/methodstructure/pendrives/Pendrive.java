package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(double percent) {
        price = (int) ((percent/100)*price)+price;
    }

    public int comparePricePerCapacity(Pendrive pendrive) {
        if((double) pendrive.getPrice()/pendrive.getCapacity() > (double) getPrice()/getCapacity()){
            return -1;
        }
        if((double) pendrive.getPrice()/pendrive.getCapacity() < (double) getPrice()/getCapacity()){
            return 1;
        }
        return 0;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return pendrive.getPrice() > getPrice();
    }
}
