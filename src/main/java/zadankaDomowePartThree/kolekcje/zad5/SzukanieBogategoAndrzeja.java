package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class SzukanieBogategoAndrzeja {
    public static void szukanieBogategoAndrzeja(List<Pracownik> pracowniks) {
        for (Pracownik osoba : pracowniks) {
            if (osoba.getImie().equals("Andrzej")) {
                if (osoba.getPensja() > 30000) {
                    System.out.println(osoba.getImie());
                }
            }
        }
    }

}
