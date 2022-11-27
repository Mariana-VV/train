package org.example.model;

public class Sachbücher extends Book{
    private String beschreibung;

    public Sachbücher() {
    }

    public Sachbücher(long isbn, String titel, String autor, boolean vergriffen, String beschreibung) {
        super(isbn, titel, autor, vergriffen);
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return "Sachbücher{" + super.toString() +
                "beschreibung='" + beschreibung + '\'' +
                '}';
    }
}
