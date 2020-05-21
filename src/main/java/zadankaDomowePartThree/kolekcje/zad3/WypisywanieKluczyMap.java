package zadankaDomowePartThree.kolekcje.zad3;

import java.util.HashMap;
import java.util.Map;

public class WypisywanieKluczyMap {
    public static void wypisanieKluczy(HashMap<String, Integer> kluczeDoWypisania){
        for (Map.Entry<String, Integer> klucz :
                kluczeDoWypisania.entrySet()) {
            System.out.println(klucz.getKey());
        }
    }
}
