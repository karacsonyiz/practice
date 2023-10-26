package server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class BooksApplication {

    private List<Book> books = Arrays.asList(
            new Book("Szophoklész","Antigoné"),
            new Book("Dickens, Charles","Karácsonyi ének"),
            new Book("Gárdonyi Géza","Egri csillagok"));

    public static void main(String[] args) { SpringApplication.run(BooksApplication.class,args); }

    @RequestMapping("/books")
    public List<Book> books(){
        return books;
    }

    @RequestMapping("/book/{id}")
    public Book book(@PathVariable int id){
        System.out.println(id);
        return books.get(id);
    }

}
