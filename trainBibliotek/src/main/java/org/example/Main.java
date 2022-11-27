package org.example;

import org.example.dao.BookDao;
import org.example.dao.BookDaoImpl;
import org.example.model.Book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.getAll();
        for (Book book: books) {
            System.out.println(book);
        }
    }
}
