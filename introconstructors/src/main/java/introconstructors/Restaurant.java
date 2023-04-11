package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    List<String> menu = new ArrayList<>();
    String name;
    int capacity;

    public Restaurant(String name,int numberOfTables){
        this.name = name;
        this.capacity = numberOfTables*4;
    }

    public void fillMenu(String firstCourse,String secondCourse,String dessert){
        this.menu.addAll(Arrays.asList(firstCourse,secondCourse,dessert));
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
