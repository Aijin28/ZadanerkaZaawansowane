package zadankaDomowePartThree.programowanieObiektowe.pojazdy;

public class SamochodDostawczy extends Pojazd {
    public SamochodDostawczy(String kodVIM, String kolorPojazdu, int johnCena, int spalanie, int stanZbiornikaPaliwa, int licznikKilometrow) {
        super(kodVIM, kolorPojazdu, johnCena, spalanie, stanZbiornikaPaliwa, licznikKilometrow, RodzajPojazdu.DOSTAWCZY);
    }
}
