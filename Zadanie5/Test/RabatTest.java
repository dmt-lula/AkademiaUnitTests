package Zadanie5.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Zadanie5.Main.Rabat;

public class RabatTest {
            // Testy dla różnych przypadków z użyciem @ParameterizedTest i @CsvSource

        @ParameterizedTest
        @CsvSource({
            "50, false, Karta",           // Brak karty
            "150, true, Rabat wynosi 10%", // Klient z kartą, wartość 150 zł
            "250, true, Rabat wynosi 15%", // Klient z kartą, wartość 250 zł
            "350, true, Rabat wynosi 20%", // Klient z kartą, wartość 350 zł
            "500, true, Rabat wynosi 25%", // Klient z kartą, wartość 500 zł
            "100, false, Karta"           // Brak karty
        })
        void testakiRabat(int zakupy, boolean czyKarta, String expectedResult) {
            assertEquals(expectedResult, Rabat.jakiRabat(zakupy, czyKarta));
        }
}
