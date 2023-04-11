package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Halászcsárda",12);
        restaurant.fillMenu("Halászlé","Paprikáscsirke","Somlói Galuska");
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());
        System.out.println(restaurant.getName());
    }
}
