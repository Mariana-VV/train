package org.example.dao;

import org.example.model.Book;


import java.util.List;

public interface BookDao {
    List<Book> getAll();
}
