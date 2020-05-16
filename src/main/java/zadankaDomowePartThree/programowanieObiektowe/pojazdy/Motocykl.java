package zadankaDomowePartThree.programowanieObiektowe.pojazdy;

public class Motocykl extends Pojazd {
    public Motocykl(String kodVIM, String kolorPojazdu, int johnCena, int spalanie, int stanZbiornikaPaliwa, int licznikKilometrow) {
        super(kodVIM, kolorPojazdu, johnCena, spalanie, stanZbiornikaPaliwa, licznikKilometrow, RodzajPojazdu.MOTOR);
    }
}
