package readerwriter;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BookTest{


    @Test
    public void createBook(){
        Book book = new Book(1L,"Vuk","Fekete István");

        assertThat(book.getAuthor(),equalTo("Fekete István"));
        assertThat(book.getTitle(),equalTo("Vuk"));
        assertThat(book.getId(),equalTo(1L));
    }




}
