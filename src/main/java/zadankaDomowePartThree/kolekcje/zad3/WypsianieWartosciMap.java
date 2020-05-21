package zadankaDomowePartThree.kolekcje.zad3;

import java.util.Map;

public class WypsianieWartosciMap {
    public static void wypisanieWartosci(Map<String, Integer> wartosciDWypisania) {
        for (Map.Entry<String, Integer> wartosc : wartosciDWypisania.entrySet()) {
            System.out.println(wartosc.getValue());
        }
    }
}
