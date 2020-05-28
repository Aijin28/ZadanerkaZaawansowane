package zadankaDomowePartThree.zadankoLambda;


public class WypisywaniePiosenekStringi {

    private PiosenkiWypisanieStringow piosenkiWypisanieStringow;

    public WypisywaniePiosenekStringi() {
        piosenkiWypisanieStringow = input -> input;
    }

    public WypisywaniePiosenekStringi(PiosenkiWypisanieStringow piosenkiWypisanieStringow) {
        this.piosenkiWypisanieStringow = piosenkiWypisanieStringow;
    }

    public String wypisanie(String input) {
        return piosenkiWypisanieStringow.wypisanieStringow(input);
    }
}
