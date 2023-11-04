package server.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Model.Book;
import server.Service.BookService;
import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @RequestMapping("/books")
    public List<Book> listBooks(){
        return bookService.listBooks();
    }

    @RequestMapping("/book/{id}")
    public Book book(@PathVariable int id){
        return bookService.getBookById(id);
    }
}
