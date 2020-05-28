package zadankaDomowePartThree.zadankoLambda;

public class WypisaniePiosenekIntegery {
    private PiosenkiWypisanieIntegerow piosenkiWypisanieIntegerow;

    public WypisaniePiosenekIntegery() {
        piosenkiWypisanieIntegerow = input -> input;
    }

    public WypisaniePiosenekIntegery(PiosenkiWypisanieIntegerow piosenkiWypisanieIntegerow) {
        this.piosenkiWypisanieIntegerow = piosenkiWypisanieIntegerow;
    }

    public Integer wypisanie (Integer input){
        return piosenkiWypisanieIntegerow.wypisanieIntegerow(input);
    }
}
