package zadankaDomowePartThree.typyGeneryczne.walizka;

import java.util.List;

public class Walizka<Ubrania> {
private List<Ubrania> walizka;

    public List<Ubrania> getWalizka() {
        return walizka;
    }

    public void setWalizka(List<Ubrania> walizka) {
        this.walizka = walizka;
    }
}
