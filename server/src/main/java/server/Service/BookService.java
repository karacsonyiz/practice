package server.Service;

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
        return book.getId();
    }

    public Long deleteBook(Long id){
        bookRepository.deleteById(id);
        return id;
    }

    public ResponseEntity<ResponseText> updateBook(Long id, Book book){

        if(bookRepository.findById(id).isPresent()){
            Book bookToSave = bookRepository.findById(id).get();
            bookToSave.setAuthor(book.getAuthor());
            bookToSave.settitle(book.gettitle());
            bookToSave.setPrice(book.getPrice());
            bookRepository.save(bookToSave);
            return new ResponseEntity<>(new ResponseText("Modification Successful!"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseText("Invalid Input!"), HttpStatus.BAD_REQUEST);
    }
}
