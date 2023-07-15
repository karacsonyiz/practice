package genericsusage.withoutgenerics;

import genericsusage.Book;
import java.util.List;

public class Library {

    public Book getFirstBook(List bookList){
        if(bookList.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty");
        }
        Book book;
        try {
            book = (Book) bookList.get(0);
        } catch (ClassCastException e) {
            throw new ClassCastException("Not a book");
        }
        return book;
    }
}
