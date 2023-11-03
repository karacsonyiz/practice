package server.Service;

import org.springframework.stereotype.Service;
import server.Database.BookDao;
import server.Model.Book;

import java.util.List;

@Service
public class BookService {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> listBooks(){
        return bookDao.listBooks();
    }

    public Book getBookById(int id){
        return bookDao.getBookById(id);
    }
}
