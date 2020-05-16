package zadankaDomowePartThree.programowanieObiektowe.pojazdy;

public class SamochodOsobowy extends Pojazd {
    public SamochodOsobowy(String kodVIM, String kolorPojazdu, int johnCena, int spalanie, int stanZbiornikaPaliwa, int licznikKilometrow) {
        super(kodVIM, kolorPojazdu, johnCena, spalanie, stanZbiornikaPaliwa, licznikKilometrow, RodzajPojazdu.OSOBOWY);
    }
}
