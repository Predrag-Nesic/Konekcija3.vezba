package konekcija3;

public class Korisnik {
    private int korisnik_id;
    private String ime;
    private String prezime;

    public Korisnik() {
    }

    public Korisnik(int korisnik_id, String ime, String prezime) {
        this.korisnik_id = korisnik_id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getKorisnik_id() {
        return korisnik_id;
    }

    public void setKorisnik_id(int korisnik_id) {
        this.korisnik_id = korisnik_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    public String toString() {
        return "Korisnik: " + getKorisnik_id() + ". " + getIme() + " " + getPrezime();
    }
    
    
}
