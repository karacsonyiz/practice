package server.Service;

import org.springframework.stereotype.Service;
import server.Database.BookRepository;
import server.Entity.Book;


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

    public Long updateBook(Long id, Book book){

        Book bookToSave = bookRepository.findById(id).get();
        bookToSave.setAuthor(book.getAuthor());
        bookToSave.setTitle(book.getTitle());
        bookRepository.save(bookToSave);
        return bookToSave.getId();
    }
}
