package sorting;

import java.util.Set;

public class OrderedLibrary {

    private final Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }

    public Book lendFirstBook() {
        if(this.library.size() == 0) {
            throw new NullPointerException("Library is empty!");
        }
        return library.iterator().next();
    }
}
