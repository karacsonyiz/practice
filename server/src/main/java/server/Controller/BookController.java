package server.Controller;

import org.springframework.web.bind.annotation.*;
import server.Entity.Book;
import server.Service.BookService;
import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public List<Book> listBooks(){
        return bookService.listBooks();
    }

    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable Long id){
        if(bookService.getBookById(id).isPresent()){
            return bookService.getBookById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/createbook", method = RequestMethod.POST)
    public long createUser(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @RequestMapping("/book/delete/{id}")
    public Long deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }

    @RequestMapping("/book/update/{id}")
    public Long updateBook(@RequestBody Book book, @PathVariable Long id){
        return bookService.updateBook(id,book);
    }

}
