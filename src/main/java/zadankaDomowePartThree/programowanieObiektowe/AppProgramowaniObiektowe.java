package zadankaDomowePartThree.programowanieObiektowe;

import zadankaDomowePartThree.programowanieObiektowe.pojazdy.Motocykl;
import zadankaDomowePartThree.programowanieObiektowe.pojazdy.SamochodOsobowy;
import zadankaDomowePartThree.programowanieObiektowe.wypozyczalnia.Wypozyczalnia;

public class AppProgramowaniObiektowe {
    public static void main(String[] args) {
        System.out.println("Test");
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();

        Motocykl motocykl = new Motocykl("123", "czerwony", 30, 6, 50, 100);
        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("1234", "czerwony", 50, 8, 200, 4000);

        wypozyczalnia.wypozyczony(motocykl);
    }
}
