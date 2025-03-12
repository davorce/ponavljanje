package Zadatak3;

public class Polazink {
    private int dob;
    private String ime;
    private String prezime;

    public Polazink(int dob, String ime, String prezime) {
        this.dob = dob;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getDob() {
        return dob;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}
