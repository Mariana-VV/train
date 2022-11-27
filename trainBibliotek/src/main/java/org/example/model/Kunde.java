package main.java.org.example.model;

public class Kunde {
    private long kundennummer;
    private String vorname;
    private String nachname;
    private String ausweisnummer;
    private boolean vermahnt;

    private String login;

    private String password;

    public Kunde(long kundennummer, String vorname, String nachname, String ausweisnummer, boolean vermahnt) {
        this.kundennummer = kundennummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.ausweisnummer = ausweisnummer;
        this.vermahnt = vermahnt;
    }

    public long getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(long kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAusweisnummer() {
        return ausweisnummer;
    }

    public void setAusweisnummer(String ausweisnummer) {
        this.ausweisnummer = ausweisnummer;
    }

    public boolean isVermahnt() {
        return vermahnt;
    }

    public void setVermahnt(boolean vermahnt) {
        this.vermahnt = vermahnt;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundennummer=" + kundennummer +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", ausweisnummer='" + ausweisnummer + '\'' +
                ", vermahnt=" + vermahnt +
                '}';
    }
}
