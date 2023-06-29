package collectionsiterator;

import java.util.HashSet;
import java.util.Set;

public class LibraryManager {

    Set<Book> bookSet;

    public LibraryManager(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Book findBookByRegNumber(int number){
        for(Book book : bookSet) {
            if(book.getRegNumber() == number) {
                return book;
            }
        }
        throw new IllegalArgumentException("No books found with regnumber:");
    }

    public int removeBookByRegNumber(int number){
        for(Book book : bookSet) {
            if(book.getRegNumber() == number) {
                bookSet.remove(book);
                return number;
            }
        }
        throw new IllegalArgumentException("No books found with regnumber:");
    }

    public int libraryBooksCount(){
        return bookSet.size();
    }

    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> foundBooks = new HashSet<>();
        for(Book book : bookSet) {
            if(book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        if(foundBooks.size() == 0) {
            throw new IllegalArgumentException("No books found by");
        }
        return foundBooks;
    }
}
