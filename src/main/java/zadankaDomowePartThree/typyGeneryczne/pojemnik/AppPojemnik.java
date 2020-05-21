package zadankaDomowePartThree.typyGeneryczne.pojemnik;

import java.util.ArrayList;
import java.util.List;

public class AppPojemnik {
    public static void main(String[] args) {
        System.out.println("TEST");
        Pojemnik pojemnik = new Pojemnik();
        List<Object> rzeczWPojemniku = new ArrayList<>();

        String pierwszaRzecz = "Somebody once told me";
        rzeczWPojemniku.add(pierwszaRzecz);

        Integer drugaRzecz = 666;
        rzeczWPojemniku.add(drugaRzecz);

        pojemnik.setDowolnaRzecz(rzeczWPojemniku);

    }
}
