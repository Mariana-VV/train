package main.java.org.example.model;

public class Roman extends Book {
    private String genre;

    public Roman() {
    }

    public Roman(long isbn, String titel, String autor, boolean vergriffen, String genre) {
        super(isbn, titel, autor, vergriffen);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Roman{" + super.toString() +
                "genre='" + genre + '\'' +
                '}';
    }
}
