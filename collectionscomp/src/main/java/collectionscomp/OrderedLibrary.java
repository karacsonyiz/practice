package collectionscomp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    private final List<Book> libraryBooks;

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }
    public List<Book> orderedByTitle() {
        List<Book> orderedBooksByTitle = new ArrayList<>(libraryBooks);
        Collections.sort(orderedBooksByTitle);
        return orderedBooksByTitle;
    }
    public List<Book> orderedByAuthor() {
        List<Book> orderedBooksByAuthor = new ArrayList<>(libraryBooks);
        orderedBooksByAuthor.sort(new AuthorComparator());
        return orderedBooksByAuthor;
    }
    public List<String> orderedByTitleLocale(Locale locale) {
        List<Book> orderedBooksByTitleAndLocale = new ArrayList<>(libraryBooks);
        List<String> result = new ArrayList<>();
        for(Book book : orderedBooksByTitleAndLocale){
            result.add(book.getTitle());
        }
        result.sort(Collator.getInstance(locale));
        return result;
    }
}
