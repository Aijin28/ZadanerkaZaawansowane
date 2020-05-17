package zadankaDomowePartThree.stringi;

public class AppString {

    public static void main(String[] args) {
        String test = "test";
        String test1 = new String("test");

        Osoba osoba = new Osoba(20, Plec.KOBIETA, "Amelia");
        Osoba osoba1 = new Osoba(20, Plec.KOBIETA, "Amelia");

        System.out.println(test.equals(test1));
        System.out.println(osoba.equals(osoba1));
        System.out.println("Dzieje się tak, ponieważ porównywane są miejsca w pamięci zamiast zawartości. " +
                "\nAby porównać zawartość, należy @Override metodę Equals i HashCode");
    }
}
