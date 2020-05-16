package zadankaDomowePartThree.programowanieObiektowe.pojazdy;

public class Pojazd {

    private String kodVIM;
    private String kolorPojazdu;
    private int johnCena;
    private int spalanie;
    private int stanZbiornikaPaliwa;
    private int licznikKilometrow;
    private RodzajPojazdu rodzajPojazdu;

    public Pojazd(String kodVIM, String kolorPojazdu, int johnCena, int spalanie, int stanZbiornikaPaliwa, int licznikKilometrow, RodzajPojazdu rodzajPojazdu) {
        this.kodVIM = kodVIM;
        this.kolorPojazdu = kolorPojazdu;
        this.johnCena = johnCena;
        this.spalanie = spalanie;
        this.stanZbiornikaPaliwa = stanZbiornikaPaliwa;
        this.licznikKilometrow = licznikKilometrow;
        this.rodzajPojazdu = rodzajPojazdu;
    }

    public Pojazd(int spalanie, int stanZbiornikaPaliwa) {
        this.spalanie = spalanie;
        this.stanZbiornikaPaliwa = stanZbiornikaPaliwa;
    }

    public String getKodVIM() {
        return kodVIM;
    }

    public String getKolorPojazdu() {
        return kolorPojazdu;
    }

    public int getJohnCena() {
        return johnCena;
    }

    public int getSpalanie() {
        return spalanie;
    }

    public int getStanZbiornikaPaliwa() {
        return stanZbiornikaPaliwa;
    }

    public int getLicznikKilometrow() {
        return licznikKilometrow;
    }

    public RodzajPojazdu getRodzajPojazdu() {
        return rodzajPojazdu;
    }

}
