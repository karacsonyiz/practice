package genericclass;

public class DataPair<T> {

    private final T firstObject;
    private final T secondObject;

    public DataPair(T firstObject, T secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public T getFirstObject() {
        return firstObject;
    }

    public T getSecondObject() {
        return secondObject;
    }
}
