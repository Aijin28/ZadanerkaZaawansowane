package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class SzukaniePoWieku {
    public static void szukaniePoWieku(List<Pracownik> pracowniks) {
        for (Pracownik osoba : pracowniks) {
            if (osoba.getWiek() > 26) {
                System.out.println(osoba.getImie());
            }
        }
    }
}
