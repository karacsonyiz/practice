package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

   private List<Object> items = new ArrayList<>();
   private int cursor = 0;

    public void putItem(Object item) {
        items.add(item);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public int size() {
        return items.size();
    }
    public void beforeFirst() {
        this.cursor = 0;
    }
    public boolean hasNext() {
        return this.cursor < items.size()-1;
    }
    public Object next() {
        Object next = items.get(this.cursor);
        this.cursor += 1;
        return next;
    }
    public boolean contains(Object item) {
        return this.items.contains(item);
    }
    public int getCursor() {
        return this.cursor;
    }
}
