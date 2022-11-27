package main.java.org.example.dao;

import main.java.org.example.model.Book;


import java.util.List;

public interface BookDao {
    List<Book> getAll();
}
