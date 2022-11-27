package main.java.org.example;

import main.java.org.example.dao.BookDao;
import main.java.org.example.dao.BookDaoImpl;
import main.java.org.example.model.Book;



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
