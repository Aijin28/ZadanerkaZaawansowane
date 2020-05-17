package zadankaDomowePartThree.wyjatki.trojkat;

public class SprawdzanieKreacjiTrojkata {
    public static void czyTrojkatMoznaSkonstruowac(Trojkat trojkat) throws ToNieMozeBycTrojkatException {
        if (trojkat.getA() == 0 && trojkat.getB() == 0 && trojkat.getC() == 0) {
            throw new ToNieMozeBycTrojkatException("Nie można skontruować tego trójkąta");
        } else if (trojkat.getC() == Math.sqrt(Math.pow(trojkat.getA(), 2) + Math.pow(trojkat.getB(), 2)) ||
                trojkat.getB() == Math.sqrt(Math.pow(trojkat.getA(), 2) + Math.pow(trojkat.getC(), 2)) ||
                trojkat.getA() == Math.sqrt(Math.pow(trojkat.getC(), 2) + Math.pow(trojkat.getB(), 2))) {
            System.out.println("Ten trójkąt składa się z trzech boków: " +
                    trojkat.getA() + ", " + trojkat.getB() + ", " + trojkat.getC());
        } else {
            throw new ToNieMozeBycTrojkatException("Nie można skontruować tego trójkąta");
        }
    }
}
