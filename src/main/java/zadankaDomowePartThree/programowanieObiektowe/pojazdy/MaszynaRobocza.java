package zadankaDomowePartThree.programowanieObiektowe.pojazdy;

public class MaszynaRobocza extends Pojazd {
    public MaszynaRobocza(String kodVIM, String kolorPojazdu, int johnCena, int spalanie, int stanZbiornikaPaliwa, int licznikKilometrow) {
        super(kodVIM, kolorPojazdu, johnCena, spalanie, stanZbiornikaPaliwa, licznikKilometrow, RodzajPojazdu.ROBOCZY);
    }
}
