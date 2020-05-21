package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class WypisaniePracownikow {
    public static void wypisanieImionPracownikow(List<Pracownik> pracowniks){
        for (Pracownik osoba :
                pracowniks) {
            System.out.println(osoba.getImie());
        }
    }
}
