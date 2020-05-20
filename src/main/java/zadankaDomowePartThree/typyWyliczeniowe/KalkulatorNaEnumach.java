package zadankaDomowePartThree.typyWyliczeniowe;

public enum KalkulatorNaEnumach {
    DODAWANIE, ODEJMOWANIE, MNOZENIE, DZIELENIE;

    double kalkulatooor(double a, double b) {
        switch (this) {
            case DODAWANIE:
                return a + b;
            case ODEJMOWANIE:
                return a - b;
            case MNOZENIE:
                return a * b;
            case DZIELENIE:
                return a / b;
            default:
                throw new AssertionError("Nienzana operacja." + this);
        }
    }
}
