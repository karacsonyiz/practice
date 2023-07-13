package collectionsclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> bookList) {
        this.library = bookList;
    }

    public List<Book> createUnmodifiableLibrary() throws UnsupportedOperationException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("books.csv");
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(";");
                library.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
            }
        } catch (IOException e) {
            System.out.println("UnsupportedOperationException happened!");
        }
        return Collections.unmodifiableList(library);
    }

    public List<Book> reverseLibrary() {
        List<Book> reversedLibrary = new ArrayList<>(library);
        Collections.reverse(reversedLibrary);
        return reversedLibrary;
    }

    public Book getFirstBook() {
        return library.get(0);
    }

    public Book getLastBook() {
        for(Book book : library) {
            System.out.println(book.getTitle());
        }
        return library.get(library.size()-1);
    }
}
