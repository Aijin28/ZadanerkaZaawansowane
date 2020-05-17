package zadankaDomowePartThree.wyjatki.dzielenie;

public class Dziel {
    public static double dziel(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else
        return (double) a / b;
    }
}
