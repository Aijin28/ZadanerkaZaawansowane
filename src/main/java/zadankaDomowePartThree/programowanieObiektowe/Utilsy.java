package zadankaDomowePartThree.programowanieObiektowe;

import zadankaDomowePartThree.programowanieObiektowe.pojazdy.Pojazd;

public class Utilsy {


    public static double ileKilometroZostloDoPrzejechania(Pojazd pojazd) {
        //pobrać z wybranego samochodu i stan baku przez spalanie przemnożyć
        int szpalanie = pojazd.getSpalanie();
        int bak = pojazd.getStanZbiornikaPaliwa();

        return (double) bak/szpalanie;

    }
}
