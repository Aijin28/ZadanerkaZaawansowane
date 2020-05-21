package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class SzukaniePoImieniu {
    public static void szukaniePoImieniu(List<Pracownik> pracowniks) {
        for (Pracownik osoba : pracowniks) {
            if (osoba.getImie().equals("BigRedGun")) {
                System.out.println(osoba.getImie());
            }
        }
    }
}
