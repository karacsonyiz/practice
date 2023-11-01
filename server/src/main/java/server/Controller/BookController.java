package server.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.Database.Book;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    private List<Book> books = Arrays.asList(
            new Book("Szophoklész","Antigoné"),
            new Book("Dickens, Charles","Karácsonyi ének"),
            new Book("Gárdonyi Géza","Egri csillagok"));


    @RequestMapping("/books")
    public List<Book> books(){
        return books;
    }

    @RequestMapping("/book/{id}")
    public Book book(@PathVariable int id){
        return books.get(id);
    }


}
