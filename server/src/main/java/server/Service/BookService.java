package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import server.Database.BookRepository;
import server.Entity.Book;
import server.Response.ResponseText;


import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> listBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public long createBook(Book book){
        bookRepository.save(book);
        LOGGER.info("Book Created with id : " + book.getId());
        return book.getId();
    }

    public Long deleteBook(Long id){
        bookRepository.deleteById(id);
        LOGGER.info("Book Deleted with id : " + id);
        return id;
    }

    public ResponseEntity<ResponseText> updateBook(Long id, Book book){

        if(bookRepository.findById(id).isPresent()){
            Book bookToSave = bookRepository.findById(id).get();
            bookToSave.setAuthor(book.getAuthor());
            bookToSave.setTitle(book.getTitle());
            bookToSave.setPrice(book.getPrice());
            bookRepository.save(bookToSave);
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        LOGGER.info("Book Modified with id : " + id);
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
