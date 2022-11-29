package org.example.dao;




import org.example.dao.BookDao;
import org.example.model.Book;
import org.example.model.Roman;
import org.example.model.Sachbücher;
import org.example.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public List<Book> getAll() {
        String query = "SELECT * FROM books WHERE available = true";
        List<Book> books = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                books.add(parseBook(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Cant get all books " + e);
        }
        return books;
    }



    private Book parseBook(ResultSet resultSet) throws SQLException {
        Book book = null;
        Long isbn = resultSet.getObject("isbn", Long.class);
        String title = resultSet.getString("title");
        String author = resultSet.getString("author");
        boolean available = resultSet.getBoolean("available");
        String discription = resultSet.getString("description");
        String genre = resultSet.getString("genre");
        if(discription != null){
            book = new Sachbücher();
        }
        if(genre != null){
            book = new Roman();
        }
        book.setIsbn(isbn);
        book.setTitel(title);
        book.setAuthor(author);
        book.setVergriffen(available);
        return book;
    }
}
