package attributes.book;

public class Bookmain {

    public static void main(String[] args) {
        Book book = new Book("Lord of the rings");
        System.out.println(book.getTitle());
        book.setTitle("Harry Potter");
        System.out.println(book.getTitle());
    }
}
