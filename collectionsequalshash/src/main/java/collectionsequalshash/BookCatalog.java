package collectionsequalshash;

import java.util.*;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        for(Book book : books) {
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;


    }
    public Book findBook(List<Book> books, Book book) {
        for(Book b : books) {
            if(b.equals(book)){
                return b;
            }
        }
        return null;
    }
    public Set<Book> addBooksToSet(Book[] books) {
        return new HashSet<>(Arrays.asList(books));
    }
}
