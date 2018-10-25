package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    private Predmet predmet = new Predmet("RPR", 12, 10);
    @Test
    void ctorAndGetters() {
        Predmet predmet = new Predmet("RPR", 12, 10);
        assertAll("Konstruktor i Getteri",
                () -> assertEquals("RPR", predmet.getNazivPredmeta()),
                () -> assertEquals(12, predmet.getSifraPredmeta()),
                () -> assertEquals(10, predmet.getMaxBrojStudenata())
                );
    }
    @Test
    void setNazivPredmeta() {
        predmet.setNazivPredmeta("OR");
        assertEquals("OR", predmet.getNazivPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        predmet.setSifraPredmeta(10);
        assertEquals(10, predmet.getSifraPredmeta());
    }

    @Test
    void ispisi() {
        Student s = new Student("Ime", "Prezime", 12345);
        predmet.upisi(s);
        predmet.ispisi(s);
        assertEquals(null, predmet.dajStudent(0));
        assertThrows(IllegalArgumentException.class, () -> {predmet.ispisi(s);});
    }

    @Test
    void upisi() {
        Predmet p = new Predmet("RPR", 12, 1);
        Student s = new Student("Ajsa", "H", 12345);
        p.upisi(s);
        assertEquals("H Ajsa (12345)", p.dajStudent(0).toString());
        assertThrows(IllegalArgumentException.class, () -> {p.upisi(s);});
        assertThrows(IllegalArgumentException.class, () -> {p.upisi(s);});
    }
}