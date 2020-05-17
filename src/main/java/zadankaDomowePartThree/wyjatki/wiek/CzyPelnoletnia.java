package zadankaDomowePartThree.wyjatki.wiek;

public class CzyPelnoletnia {
    public static void czyPelnoletnia(Osoba osoba) throws NiepelnoletniException{
        if(osoba.getWiek()<18){
            throw new NiepelnoletniException("Nie jesteś pełnoletni");
        }
        System.out.println("jesteś pełnoletni");
    }
}
