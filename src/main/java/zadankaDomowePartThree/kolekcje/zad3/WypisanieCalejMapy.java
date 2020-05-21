package zadankaDomowePartThree.kolekcje.zad3;

import java.util.Map;

public class WypisanieCalejMapy {
    public static void wypisanieCalejMapy(Map<String, Integer> calaMapDoWypisania){
        for (Map.Entry<String, Integer> calaMapa :
                calaMapDoWypisania.entrySet()) {
            System.out.println(calaMapa.getKey() + " : " + calaMapa.getValue());
        }
    }
}
