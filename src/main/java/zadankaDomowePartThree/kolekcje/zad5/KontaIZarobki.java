package zadankaDomowePartThree.kolekcje.zad5;

import java.util.HashMap;
import java.util.List;

public class KontaIZarobki {
    public static HashMap<Integer, Integer> mapaKontIZarobkow(List<Pracownik> pracowniks) {
        HashMap<Integer, Integer> kontaIZarobki = null;
        for (Pracownik osoba : pracowniks) {
            kontaIZarobki.put(osoba.getNrKonta(), osoba.getPensja());
        }return kontaIZarobki;
    }
}
