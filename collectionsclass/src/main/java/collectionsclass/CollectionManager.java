package collectionsclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionManager {

    private List<Book> bookList;

    public CollectionManager(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void readFromCsv() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("books.csv");
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
            }
        }
    }

    public List<Book> createUnmodifiableLibrary(){
        return null;
    }

    public List<Book> reverseLibrary() {
        return null;
    }

    public Book getFirstBook() {
        return null;
    }

    public Book getLastBook() {
        return null;
    }
}
