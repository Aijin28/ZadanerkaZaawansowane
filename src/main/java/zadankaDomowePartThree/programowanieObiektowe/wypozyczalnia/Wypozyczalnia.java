package zadankaDomowePartThree.programowanieObiektowe.wypozyczalnia;

import zadankaDomowePartThree.programowanieObiektowe.Utilsy;
import zadankaDomowePartThree.programowanieObiektowe.pojazdy.Pojazd;

public class Wypozyczalnia implements wypozyczonyZwrocony {

    @Override
    public void wypozyczony(Pojazd pojazd) {
        System.out.println(pojazd.getKolorPojazdu() + " " +
                pojazd.getRodzajPojazdu() +
                " o kodzie VIN " + pojazd.getKodVIM() +
                " zostal wypożyczony. Przejedzie " +
                Utilsy.ileKilometroZostloDoPrzejechania(pojazd) + " kilometrów.");
    }

    @Override
    public void zwrocony(Pojazd pojazd) {
        System.out.println(pojazd.getKolorPojazdu() + " " +
                pojazd.getRodzajPojazdu() +
                " o kodzie VIN " + pojazd.getKodVIM() +
                " zostal wypożyczony");
    }
}
