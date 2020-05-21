package zadankaDomowePartThree.kolekcje.zad3;

import java.util.HashMap;

public class AppZadanie3 {
    public static void main(String[] args) {
        System.out.println("TEST");
        HashMap<String, Integer> mapaLudzi = new HashMap<>();
        mapaLudzi.put("Mateusz", 25);
        mapaLudzi.put("Kasia", 23);
        mapaLudzi.put("Andrzej", 30);
        mapaLudzi.put("Piotr", 27);

        WypisywanieKluczyMap.wypisanieKluczy(mapaLudzi);
        WypsianieWartosciMap.wypisanieWartosci(mapaLudzi);
        mapaLudzi.put("Mateusz", 30);
        WypisanieCalejMapy.wypisanieCalejMapy(mapaLudzi);
        System.out.println("Dzieje się tak, ponieważ jeden klucz nie może miec dwóch różnych wartości");
    }
}
