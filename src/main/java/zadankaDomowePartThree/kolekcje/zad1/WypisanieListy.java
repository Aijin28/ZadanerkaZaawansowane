package zadankaDomowePartThree.kolekcje.zad1;

import java.util.List;

public class WypisanieListy {
    public static void wypisanieListy(List<Integer> lista) {
        System.out.print("[");
        for (int i = 0; i < lista.size(); i++) {
            if (i == lista.size() - 1) {
                System.out.print(lista.get(i) + "(" + i + ")");
            } else
                System.out.print(lista.get(i) + "(" + i + "), ");
        }
        System.out.print("]\n");
    }
}
