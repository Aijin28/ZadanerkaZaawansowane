package zadankaDomowePartThree.zadankoLambda;

public class Piosenki {

    private String kapela;
    private String utwor;
    private int minuty;
    private int sekundy;

    public Piosenki(String kapela, String utwor, int minuty, int sekundy) {
        this.kapela = kapela;
        this.utwor = utwor;
        this.minuty = minuty;
        this.sekundy = sekundy;
    }

    public String getKapela() {
        return kapela;
    }

    public String getUtwor() {
        return utwor;
    }

    public Integer getMinuty() {
        return minuty;
    }

    public Integer getSekundy() {
        return sekundy;
    }
}
