package dpintro.iteratorpattern;

import java.util.List;

public class ZooIterator implements Iterator {

    private final List<Animal> animalList;
    private int pointer = 0;

    public ZooIterator(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean hasNext() {
        pointer += 1;
        try {
            Animal a = animalList.get(pointer);
        } catch (IndexOutOfBoundsException e) {
            pointer -= 1;
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return animalList.get(pointer);
    }

}
