package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class SzukaniePoImieniu {
    public static int szukaniePoImieniu(List<Pracownik> pracowniks) {
        int szukanaOsoba = 666;
        for (Pracownik osoba : pracowniks) {
            if (osoba.getImie().equals("BuiikiKaesu")) {
                szukanaOsoba = pracowniks.indexOf(osoba);
            }
        }
        return szukanaOsoba;
    }
}
