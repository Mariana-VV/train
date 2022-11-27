package main.java.org.example.model;

public abstract class Book {
    private long isbn;
    private String titel;
    private String author;
    private boolean vergriffen;

    public Book() {
    }

    public Book(long isbn, String titel, String autor, boolean vergriffen) {
        this.isbn = isbn;
        this.titel = titel;
        this.author = autor;
        this.vergriffen = vergriffen;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return author;
    }


    public boolean isVergriffen() {
        return vergriffen;
    }


    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVergriffen(boolean vergriffen) {
        this.vergriffen = vergriffen;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", titel='" + titel + '\'' +
                ", autor='" + author + '\'' +
                ", vergriffen=" + vergriffen +
                '}';
    }
}
