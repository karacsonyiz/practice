package objects;

import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        Book book1 = new Book("Hobbit");
        Book book2 = new Book("Silmarillion");
        Book book3 = new Book("New Shadow");

        List<Book> bookList = Arrays.asList(new Book("Gyűrűk Ura"),new Book("Harry Potter"),new Book("Rómeó és Júlia"));

        List<Book> bookList1 = Arrays.asList(book1,book2,book3);

    }
}
