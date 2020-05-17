package zadankaDomowePartThree.wyjatki.wiek;

public class AppWiek {

    public static void main(String[] args) {
        Osoba osoba = new Osoba(27);
        Osoba osoba1 = new Osoba(17);

        try {
            CzyPelnoletnia.czyPelnoletnia(osoba);
            CzyPelnoletnia.czyPelnoletnia(osoba1);
        } catch (NiepelnoletniException e) {
            e.printStackTrace();
        }

    }
}
