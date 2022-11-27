package main.java.org.example.controller.book;

import main.java.org.example.dao.BookDao;
import main.java.org.example.dao.BookDaoImpl;
import main.java.org.example.model.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetAllBooksController extends HttpServlet {
    private BookDao bookDao = new BookDaoImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Book> allBooks = bookDao.getAll();
        req.setAttribute("books", allBooks);
        req.getRequestDispatcher("/WEB-INF/views/books/all.jsp").forward(req, resp);
    }
}

