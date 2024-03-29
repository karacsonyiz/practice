package sorting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class OrderedLibraryTest {

    private List<Book> bookList = new ArrayList<>();

    @Before
    public void setUp() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("books.csv");
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("File not found");
        }
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void emptyCollectionShouldThrowException() throws NullPointerException {
        // Given
        exception.expect(NullPointerException.class);
        exception.expectMessage("Library is empty!");
        // When
        new OrderedLibrary(new TreeSet<>()).lendFirstBook();
    }

    @Test
    public void testLendFirstBook() {
        // Given
        Collections.shuffle(bookList);
        OrderedLibrary ol = new OrderedLibrary(new TreeSet<>(bookList));
        // When
        Book book = ol.lendFirstBook();
        //Then
        assertThat(book.getId(), equalTo(1001));
    }
}
