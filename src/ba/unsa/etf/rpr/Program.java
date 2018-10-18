package ba.unsa.etf.rpr;

public class Program {
    public static class Student {
        private String ime, prezime;
        private int brojIndeksa;
        Student(String ime, String prezime, int index) {
            this.ime = ime;
            this.prezime = prezime;
            brojIndeksa = index;
        }
        String getIme() {
            return ime;
        }
        String getPrezime() {
            return prezime;
        }
        int getBrojIndeksa() {
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
            String s = this.prezime + " " + this.ime + "(" + this.brojIndeksa + ")";
            return s;
        }
        private void ispisi() {
            System.out.println(getPrezime() + " " + getIme() + "(" + getBrojIndeksa() + ")");
        }
    }
    public static class Predmet {
        private Student[] studenti;
        private String nazivPredmeta;
        private int sifraPredmeta;
        private final int maxBrojStudenata;

        Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata) {
            this.nazivPredmeta = nazivPredmeta;
            this.sifraPredmeta = sifraPredmeta;
            studenti = new Student[maxBrojStudenata];
            this.maxBrojStudenata = maxBrojStudenata;
        }
        public String getNazivPredmeta() {
            return nazivPredmeta;
        }
        public int getSifraPredmeta() {
            return sifraPredmeta;
        }
        public int getMaxBrojStudenata() {
            return maxBrojStudenata;
        }
        public void setNazivPredmeta(String nazivPredmeta) {
            this.nazivPredmeta = nazivPredmeta;
        }
        public void setSifraPredmeta(int sifraPredmeta) {
            this.sifraPredmeta = sifraPredmeta;
        }

        private void ispisi(Student s) {
            for(int i = 0; i < getMaxBrojStudenata(); i++)
                if(studenti[i] != null && s.equals(studenti[i]))  {
                    for(int j = i; j < getMaxBrojStudenata() - 1; j++)
                        if(studenti[j] != null)
                            studenti[j] = studenti[j + 1];
                }
        }
        private void upisi(Student s) {
            for(int i = 0; i < getMaxBrojStudenata(); i++)
                if(studenti[i] == null) {
                    studenti[i] = s;
                    break;
                }
        }
        private void ispisi() {
            for(int i = 0; i < getMaxBrojStudenata(); i++)
                if(studenti[i] != null)  System.out.println(studenti[i]);//System.out.println(i + 1 + "." + studenti[i].getPrezime() + " " +  studenti[i].getIme() + "(" + studenti[i].getBrojIndeksa() + ")");
        }
    }
        public static void main(String[] args) {
            Program.Predmet p = new Program.Predmet("RPR", 1, 10);
            Program.Student s = new Program.Student("Ajsa", "Haj", 12345);
            Program.Student s1 = new Program.Student("Ime", "Prezime", 54321);
            p.upisi(s);
            p.upisi(s1);
            p.ispisi();
        }
}
