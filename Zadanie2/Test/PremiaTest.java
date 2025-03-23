package Zadanie2.Test;
import Zadanie2.Main.Premia;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PremiaTest {

    private Premia prem;

    
    @BeforeEach
    public void setUp(){
        prem = new Premia();
    }
    // Klasy równoważności pozytywne:
    @Test
    public void testPremiaDo3() {
        // Wartosci brzegowe: 0, 3
        // vEC1: 0 <= x < 4 
        assertEquals(0, prem.ppremia(0));
        assertEquals(0, prem.ppremia(3));
    }

    @Test
    public void testPremiaDo8() {
        // Wartosci brzegowe: 4, 8
        // vEC2: 4 <= x <= 8
        assertEquals(50, prem.ppremia(4));
        assertEquals(50, prem.ppremia(8));
    }

    @Test
    public void testPremiaDo11() {
        // Wartosci brzegowe: 9, 11
        // vEC3: 8 < x <=11
        assertEquals(70, prem.ppremia(9));
        assertEquals(70, prem.ppremia(11));
    }

    @Test
    public void testPremiaDo70() {
        // Wartosci brzegowe: 12, 70
        // vEC4: 11 < x <=70
        assertEquals(100, prem.ppremia(12));
        assertEquals(100, prem.ppremia(70));
    }

    // Klasy równoważności negatywne:
    @Test
    public void testPremiaDo0() {
        // Wartosci brzegowe: -1
        // iEC1: x < 0
        assertThrows(IllegalArgumentException.class, () -> prem.ppremia(-1), "Staż nie może być mniejszy od 0");
    }

    @Test
    public void testPremiaOd70() {
       // Wartosci brzegowe: 71
        // iEC1: x > 70
        assertThrows(IllegalArgumentException.class, () -> prem.ppremia(71), "Staż nie może być większy niż 70");
    }
}
