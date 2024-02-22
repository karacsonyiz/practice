package server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import server.Entity.Book;
import server.Service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BooksTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    BookService bookService;

    @Test
    public void shouldReturnBooks() throws Exception {
        this.mockMvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{\"author\":\"Szophoklész\",\"title\":\"Antigoné\"},{\"author\":\"Dickens, Charles\",\"title\":\"Karácsonyi ének\"},{\"author\":\"Gárdonyi Géza\",\"title\":\"Egri csillagok\"}]"));
    }

    @Test
    public void shouldReturnABook() throws Exception {
        this.mockMvc.perform(get("/book/0"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"author\":\"Szophoklész\",\"title\":\"Antigoné\"}"));
    }

    @Test
    public void createBookTest() {

        List<Book> bookList = bookService.listBooks();

        assertEquals(bookList.size(), 3);

        Book book = new Book("J.K. Rowling","Harry Potter : Prisoner of Azkaban", 100);
        bookService.createBook(book);

        assertEquals(bookList.size(), 4);
    }

    public void deleteBookTest() {
        List<Book> bookList = bookService.listBooks();

        assertEquals(bookList.size(), 3);

        bookService.deleteBook(2L);

        assertEquals(bookList.size(), 2);
    }

    @Test
    public void updateBookTest() {

        assertEquals(bookService.getBookById(3L).get().getPrice(), 100);

        Book book = new Book("J.K. Rowling","Harry Potter : Prisoner of Azkaban", 200);
        bookService.updateBook(3L,book);

        assertEquals(bookService.getBookById(3L).get().getPrice(), 200);
    }
}
