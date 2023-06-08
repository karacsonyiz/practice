package dpintro.iteratorpattern;

import java.util.List;

public class Zoo implements Container {

    private final List<Animal> animalList;

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public Iterator getIterator() {
        return new ZooIterator(animalList);
    }
}
