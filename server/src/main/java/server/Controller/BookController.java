package server.Controller;

import org.springframework.web.bind.annotation.*;
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
    public Book getBook(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/createbook", method = RequestMethod.POST)
    public long createUser(@RequestBody Book book) {

        return bookService.createBook(book);
    }

    @RequestMapping("/book/delete/{id}")
    public int deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);
    }

}
