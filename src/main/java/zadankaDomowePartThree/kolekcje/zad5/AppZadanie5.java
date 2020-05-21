package zadankaDomowePartThree.kolekcje.zad5;

import zadankaDomowePartThree.stringi.Plec;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AppZadanie5 {
    public static void main(String[] args) {
//        System.out.println("TEST");
        List<Pracownik> listaPracownikow = Arrays.asList(
        new Pracownik("Savior", 30, 1000, 2, Plec.MEZCZYZNA, 11111),
        new Pracownik("MeineBrille", 45, 2000, 20, Plec.MEZCZYZNA, 111112),
        new Pracownik("BuiikiKaesu", 28, 3000, 1, Plec.KOBIETA, 111113),
        new Pracownik("DejaVu", 20, 4000, 4, Plec.INNE, 111114),
        new Pracownik("Fallenleaves", 25, 5000, 7, Plec.KOBIETA, 111115),
        new Pracownik("BigRedGun", 22, 6000, 2, Plec.INNE, 111116)
        );

        SzukaniePoWieku.szukaniePoWieku(listaPracownikow);
        SzukanieKobietPoStazu.szukanieDoswiadczonychKobiet(listaPracownikow);
        SzukanieBogategoAndrzeja.szukanieBogategoAndrzeja(listaPracownikow);
        SzukaniePoImieniu.szukaniePoImieniu(listaPracownikow);
        WypisaniePracownikow.wypisanieImionPracownikow(listaPracownikow);
        System.out.println(SumowaniePensji.sumaPensji(listaPracownikow));




    }
}
