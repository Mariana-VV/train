package org.example.model;

import java.time.LocalDate;

public class Entlehnung {
    private LocalDate localDate;
    private Kunde kunde;
    private Book book;

    public Entlehnung(LocalDate localDate, Kunde kunde, Book book) {
        this.localDate = localDate;
        this.kunde = kunde;
        this.book = book;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Entlehnung{" +
                "localDate=" + localDate +
                ", kunde=" + kunde +
                ", book=" + book +
                '}';
    }
}
