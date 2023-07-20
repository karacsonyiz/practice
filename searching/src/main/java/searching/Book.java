package searching;

public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;

    public Book(int id, String author, String title) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Book o) {
        int result = author.compareTo(o.author);
        if (result == 0) {
            result = title.compareTo(o.title);
        }
        return result;
    }

    @Override
    public String toString() {
        return id +
                " " + author + " " + title ;
    }
}
