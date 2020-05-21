package zadankaDomowePartThree.kolekcje.zad5;

import zadankaDomowePartThree.stringi.Plec;

public class Pracownik {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pracownik pracownik = (Pracownik) o;

        return imie != null ? imie.equals(pracownik.imie) : pracownik.imie == null;
    }

    @Override
    public int hashCode() {
        return imie != null ? imie.hashCode() : 0;
    }

    private String imie;
    private Integer wiek;
    private Integer pensja;
    private Integer staz;
    private Plec plec;
    private Integer nrKonta;

    public Pracownik(String imie, Integer wiek, Integer pensja, Integer staz, Plec plec, Integer nrKonta) {
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
        this.staz = staz;
        this.plec = plec;
        this.nrKonta = nrKonta;
    }

    public String getImie() {
        return imie;
    }


    public Plec getPlec() {
        return plec;
    }

    public Integer getWiek() {
        return wiek;
    }

    public Integer getPensja() {
        return pensja;
    }

    public Integer getStaz() {
        return staz;
    }

    public Integer getNrKonta() {
        return nrKonta;
    }

    public Pracownik(Integer pensja, Integer nrKonta) {
        this.pensja = pensja;
        this.nrKonta = nrKonta;
    }
}

