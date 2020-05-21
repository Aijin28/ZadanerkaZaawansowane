package zadankaDomowePartThree.kolekcje.zad5;

import java.util.List;

public class SumowaniePensji {
    public static int sumaPensji (List<Pracownik> pracowniks){
        int suma = 0;
        for (Pracownik osoba :pracowniks) {
            suma = suma + osoba.getPensja();
        }
        return suma;
    }
}
