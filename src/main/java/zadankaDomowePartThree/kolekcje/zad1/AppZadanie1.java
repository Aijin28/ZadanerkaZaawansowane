package zadankaDomowePartThree.kolekcje.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AppZadanie1 {
    public static void main(String[] args) {
        System.out.println("TEST");
        ListaLiczbCalkowitych listaLiczbCalkowitych = new ListaLiczbCalkowitych();
        List<Integer> listaTymczasowa = new ArrayList<>();
        Set<Integer> zbiorLiczbCalkowitych = new TreeSet<>();
        listaTymczasowa.add(1);
        listaTymczasowa.add(2);
        listaTymczasowa.add(2);
        listaTymczasowa.add(2);
        listaTymczasowa.add(4);
        listaTymczasowa.add(5);
        listaTymczasowa.add(13);
        listaTymczasowa.add(3);
        listaTymczasowa.add(2);
        listaTymczasowa.add(1);
        listaTymczasowa.add(1);
        listaTymczasowa.add(18);
        listaTymczasowa.add(37);
        listaTymczasowa.add(3);
        listaLiczbCalkowitych.setListaLiczbCalkowitych(listaTymczasowa);
        WypisanieListy.wypisanieListy(listaTymczasowa);
//        SortowanieListy.sortowanieListy(listaTymczasowa);
//        WypisanieListy.wypisanieListy(listaTymczasowa);
        zbiorLiczbCalkowitych.addAll(listaTymczasowa);
        WypisanieZbioru.wypisanieZbioru(zbiorLiczbCalkowitych);



    }



}
