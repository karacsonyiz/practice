package searching;

public class Book implements Comparable<Book> {

    int regNumber;
    String title;
    String author;

    public Book(int regNumber, String title, String author) {
        this.regNumber = regNumber;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public int compareTo(Book o) {
        int result = author.compareTo(o.author);
        if (result == 0) {
            result = title.compareTo(o.title);
        }
        return result;
    }
}
