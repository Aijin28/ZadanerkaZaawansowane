package zadankaDomowePartThree.wyjatki.trojkat;

public class AppTrojkat {
    public static void main(String[] args) {
        System.out.println("teszt");

        Trojkat trojkat = new Trojkat(4,3,5 );
        try {
            SprawdzanieKreacjiTrojkata.czyTrojkatMoznaSkonstruowac(trojkat);
        } catch (ToNieMozeBycTrojkatException e) {
            e.printStackTrace();
        }
    }
}
