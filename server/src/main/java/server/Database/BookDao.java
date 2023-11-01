package server.Database;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class BookDao {

    private JdbcTemplate jdbcTemplate;

    public BookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class UserMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet resultSet, int i) throws SQLException {
            String author = resultSet.getString("author");
            String title = resultSet.getString("title");
            return new Book(author, title);
        }
    }

    public long createUser(Book book) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(
                        "insert into book(author, title) values(?, ?)",
                        Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, book.getAuthor());
                ps.setString(2, book.getTitle());
                return ps;
            }
        }, keyHolder);
        return keyHolder.getKey().longValue();
    }
}
