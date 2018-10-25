package ba.unsa.etf.rpr.t1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student s = new Student("Ime", "Prezime", 12345);
    @Test
    void getIme() {
        assertEquals("Ime", s.getIme());
    }

    @Test
    void getPrezime() {
        assertEquals("Prezime", s.getPrezime());
    }

    @Test
    void getBrojIndeksa() {
        assertEquals(12345, s.getBrojIndeksa());
    }

    @Test
    void setIme() {
        s.setIme("Ajsa");
        assertEquals("Ajsa", s.getIme());
    }

    @Test
    void setPrezime() {
        s.setPrezime("Hajradinovic");
        assertEquals("Hajradinovic", s.getPrezime());
    }

    @Test
    void setBrojIndeksa() {
        s.setBrojIndeksa(18031);
        assertEquals(18031, s.getBrojIndeksa());
    }

    @Test
    void testToString() {
        assertEquals("Prezime Ime (12345)", s.toString());
    }
}