package zadankaDomowePartThree.programowanieObiektowe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadankaDomowePartThree.programowanieObiektowe.pojazdy.Pojazd;

class UtilsyTest {

    private Pojazd pojazd;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.pojazd = new Pojazd(7, 70);
    }

    @Test
    void testCzyPoprawnieLiczyPrzewidywanaIloscKilometrowDoPrzejechania() {
     Assertions.assertEquals((double) 70/7, Utilsy.ileKilometroZostloDoPrzejechania(pojazd));
    }
}