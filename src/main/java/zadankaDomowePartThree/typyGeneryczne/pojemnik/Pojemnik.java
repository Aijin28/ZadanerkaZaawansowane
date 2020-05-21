package zadankaDomowePartThree.typyGeneryczne.pojemnik;

import java.util.List;

public class Pojemnik<T> {
    public List<T> dowolnaRzecz;

    public List<T> getDowolnaRzecz() {
        return dowolnaRzecz;
    }

    public void setDowolnaRzecz(List<T> dowolnaRzecz) {
        this.dowolnaRzecz = dowolnaRzecz;
    }


}
