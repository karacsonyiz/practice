package classtructure;

public class Book {

    private String author;
    private String title;
    private String regNumber;

    public Book(String author,String title){
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber){
        this.regNumber = regNumber;
    }

    public static void main(String[] args) {
        Book book = new Book("J.R.R Tolkien","The Silmarillion");
        book.register("ISBN 972-3-11-148310-1");
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.regNumber);
        System.out.println(book);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}


