package zadankaDomowePartThree.typyGeneryczne.walizka;

import java.util.ArrayList;
import java.util.List;

public class AppWalizka {
    public static void main(String[] args) {
        System.out.println("TEST");
        Walizka walizka = new Walizka();
        List<Ubrania> listaUbran = new ArrayList<>();

        Ubrania ubranie1 = new Ubrania("spodnie");
        Ubrania ubranie2 = new Ubrania("bluza");
        Ubrania ubranie3 = new Ubrania("koszulka");
        Ubrania ubranie4 = new Ubrania("bielizna");

        listaUbran.add(ubranie1);
        listaUbran.add(ubranie2);
        listaUbran.add(ubranie3);
        listaUbran.add(ubranie4);

        walizka.setWalizka(listaUbran);


    }
}
