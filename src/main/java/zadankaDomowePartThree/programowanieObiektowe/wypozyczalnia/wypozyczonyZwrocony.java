package zadankaDomowePartThree.programowanieObiektowe.wypozyczalnia;

import zadankaDomowePartThree.programowanieObiektowe.pojazdy.Pojazd;

public interface wypozyczonyZwrocony {
    void wypozyczony(Pojazd pojazd);

    void zwrocony(Pojazd pojazd);
}
