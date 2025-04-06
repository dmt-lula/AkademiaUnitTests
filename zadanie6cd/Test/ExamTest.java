package zadanie6cd.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import zadanie6cd.Main.*;

public class ExamTest {
    // Testy dla funkcji calculateExam
    @ParameterizedTest
    @ValueSource(strings = {
        "B;B;C;D;A;C;B;B;A;C",  // 30/30 - 100% - bardzo dobra (5.0)
        "B;B;B;B;B;B;B;B;B;B",  // -12/30 - 0% - niedostateczna (2.0)
        "B;B;C;D;A;C;B;B;_;_",  // 22/30 - 73.33% - dobra (4.0)
        "A;A;A;A;A;A;A;A;A;A",  // 0/30 - 0% - niedostateczna (2.0)
        "_;B;_;B;_;B;_;B;_;B"   // -26/30 - 03% - niedostateczna (2.0)
    })
    public void examTestidyTest(String answers) {
        // Losowy klucz odpowiedzi dla studenta
        String correctAnswers = "B;B;C;D;A;C;B;B;A;C";

        // Obliczamy ocenę na podstawie odpowiedzi studenta
        String grade = Exam.calculateExam(answers, correctAnswers);

        // Sprawdzamy, czy wynik jest zgodny z oczekiwanym
        if (answers.equals("B;B;C;D;A;C;B;B;A;C")) {
            assertEquals("5.0", grade);  // 100%
        } else if (answers.equals("B;B;B;B;B;B;B;B;B;B")) {
            assertEquals("2.0", grade);  // 33.33%
        } else if (answers.equals("B;B;C;D;A;C;B;B;_;_")) {
            assertEquals("4.0", grade);  // 73.33%
        } else if (answers.equals("A;A;A;A;A;A;A;A;A;A")) {
            assertEquals("2.0", grade);  // 0%
        } else if (answers.equals("_;B;_;B;_;B;_;B;_;B")) {
            assertEquals("2.0", grade);  // 33.33%
        }
    }
}

