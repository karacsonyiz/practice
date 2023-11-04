package server.Database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import server.Model.Book;

import java.sql.*;
import java.util.List;
import java.util.UUID;

@Repository
public class BookDao {

    private JdbcTemplate jdbcTemplate;

    public BookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class BookMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String author = resultSet.getString("author");
            String title = resultSet.getString("title");
            return new Book(id, author, title);
        }
    }
    public List<Book> listBooks() {
        return jdbcTemplate.query("select id, author, title from book",
                new BookMapper());
    }

    public Book getBookById(int id){
                return jdbcTemplate.queryForObject("select id, author, title from book where id = ?",
                        new BookMapper(), id);
    }

    public long createBook(Book book) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into book(author, title) values(?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }
}
