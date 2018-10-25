package ba.unsa.etf.rpr.t1;

public class Predmet {
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

    public void ispisi(Student s) throws IllegalArgumentException {
        boolean ispisan = false;
        for(int i = 0; i < getMaxBrojStudenata(); i++)
            if(studenti[i] != null && s.equals(studenti[i]))  {
                for(int j = i; j < getMaxBrojStudenata() - 1; j++) {
                    ispisan = true;
                    if (studenti[j] != null)
                        studenti[j] = studenti[j + 1];
                }
            }
        if(!ispisan) throw new IllegalArgumentException("Student ne postoji!");
    }
    public void upisi(Student s) throws IllegalArgumentException {
        boolean dostignutMax = false;
        for(int i = 0; i < getMaxBrojStudenata(); i++) {
            if(dostignutMax) throw new IllegalArgumentException ("Upisan je maksimalan broj studenata!");
            if(studenti[i] == s) throw new IllegalArgumentException("Student je vec upisan!");
            if (studenti[i] == null) {
                studenti[i] = s;
                break;
            }
            if(i == maxBrojStudenata - 1)  dostignutMax = true;
        }
    }
    public void ispisi() {
        for(int i = 0; i < getMaxBrojStudenata(); i++) if(studenti[i] != null)  System.out.println(studenti[i]);
    }
    public Student dajStudent(int i) throws IllegalArgumentException {
        if(i < 0 || i >= maxBrojStudenata) throw new IllegalArgumentException("Indeks van opsega!");
        return studenti[i];
    }
}

