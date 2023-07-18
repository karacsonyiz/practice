package collectionscomp;

public class Book implements Comparable<Book>{

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
        return title.compareTo(o.title);
    }
}
