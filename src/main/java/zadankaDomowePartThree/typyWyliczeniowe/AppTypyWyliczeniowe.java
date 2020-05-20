package zadankaDomowePartThree.typyWyliczeniowe;

public class AppTypyWyliczeniowe {
    public static void main(String[] args) {
        LiczbyKlasa liczba1 = new LiczbyKlasa(LiczbyWyliczenie.RAZ);
        System.out.println(liczba1.getLiczbyWyliczenie());
        liczba1.getLiczbyWyliczenie().liczbyWypisanie();

        LiczbyKlasa liczba2 = new LiczbyKlasa(LiczbyWyliczenie.DWA);
        System.out.println(liczba2.getLiczbyWyliczenie());
        liczba2.getLiczbyWyliczenie().liczbyWypisanie();

        LiczbyKlasa liczba3 = new LiczbyKlasa(LiczbyWyliczenie.TRZY);
        System.out.println(liczba3.getLiczbyWyliczenie());
        liczba3.getLiczbyWyliczenie().liczbyWypisanie();

        LiczbyKlasa liczba4 = new LiczbyKlasa(LiczbyWyliczenie.CZTERY);
        System.out.println(liczba4.getLiczbyWyliczenie());
        liczba4.getLiczbyWyliczenie().liczbyWypisanie();

        System.out.println(KalkulatorNaEnumach.DODAWANIE.kalkulatooor(5, 6));
        System.out.println(KalkulatorNaEnumach.ODEJMOWANIE.kalkulatooor(21, 37));
        System.out.println(KalkulatorNaEnumach.MNOZENIE.kalkulatooor(9, 11));
        System.out.println(KalkulatorNaEnumach.DZIELENIE.kalkulatooor(95, 23));

    }
}
