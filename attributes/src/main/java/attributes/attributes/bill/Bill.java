package attributes.attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public double calculatePrice(){
        double sum = 0;
        for(Item item : this.items){
            sum += item.getPrice()*item.getQuantity();
        }
        return sum;
    }
}
