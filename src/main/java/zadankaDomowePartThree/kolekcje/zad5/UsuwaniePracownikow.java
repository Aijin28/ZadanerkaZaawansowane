package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class UsuwaniePracownikow {
    public static List<Pracownik> zmniejszonaListaPracownikow (List<Pracownik> pracowniks, int numerIndexu){
        List<Pracownik> zmniejszonaLista = null;
        pracowniks.remove(numerIndexu);
        zmniejszonaLista.addAll(pracowniks);
        return zmniejszonaLista;
    }
}
