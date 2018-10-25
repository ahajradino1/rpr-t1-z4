package ba.unsa.etf.rpr;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;
    Student(String ime, String prezime, int index) {
        this.ime = ime;
        this.prezime = prezime;
        brojIndeksa = index;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojIndeksa(int index) {
        brojIndeksa = index;
    }
    public String toString() {
        String s = this.prezime + " " + this.ime + " (" + this.brojIndeksa + ")";
        return s;
    }
    private void ispisi() {
        System.out.println(this);
    }
}