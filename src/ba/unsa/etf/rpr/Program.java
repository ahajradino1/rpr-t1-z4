package ba.unsa.etf.rpr;

public class Program {
        public static void main(String[] args) {
            Predmet p = new Predmet("RPR", 1, 10);
            Student s = new Student("Ajsa", "Haj", 12345);
            Student s1 = new Student("Ime", "Prezime", 54321);
            p.upisi(s);
            p.upisi(s1);
            p.ispisi(s1);
            p.ispisi();

        }
}
