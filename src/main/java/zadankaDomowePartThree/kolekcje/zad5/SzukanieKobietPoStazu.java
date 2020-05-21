package zadankaDomowePartThree.kolekcje.zad5;

import zadankaDomowePartThree.stringi.Plec;

import java.util.List;

public class SzukanieKobietPoStazu {
    public static void szukanieDoswiadczonychKobiet(List<Pracownik> pracowniks) {
        for (Pracownik osoba : pracowniks) {
            if (osoba.getPlec() == Plec.KOBIETA) {
                if (osoba.getStaz() > 5) {
                    System.out.println(osoba.getImie());
                }
            }
        }
    }
}
