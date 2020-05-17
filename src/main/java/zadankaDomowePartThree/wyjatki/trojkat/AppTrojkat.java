package zadankaDomowePartThree.wyjatki.trojkat;

public class AppTrojkat {
    public static void main(String[] args) {
        System.out.println("teszt");

        Trojkat trojkat = new Trojkat(3, 4, 1);
        try {
            SprawdzanieKreacjiTrojkata.czyTrojkatMoznaSkonstruowac(trojkat);
        } catch (ToNieMozeBycTrojkatException e) {
            e.printStackTrace();
        }
    }
}
