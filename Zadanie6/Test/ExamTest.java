package Zadanie6.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Zadanie6.Main.*;

public class ExamTest {
    @ParameterizedTest
    @ValueSource(strings={
    "A;A;A;A;A;A;A;A;A;A;",
    "B;A;C;D;B;B;A;C;B;A;",  // Ocena dostateczna
    "B;B;C;D;B;A;B;C;B;A;",  // Ocena dostateczna plus
    "B;B;B;B;B;B;B;B;B;B;",  // Ocena bardzo dobra (5.0)
    "_;_;_;_;_;_;_;_;_;_;",  // Ocena niedostateczna
    "A;C;D;A;C;D;A;C;D;A;",  // Ocena niedostateczna (2.0)
    "B;_;C;_;B;_;A;_;B;A;"   // Ocena dostateczna plus
    })
    public void examTestidyTest(String answers){
        //Arrange
        Exam exam = new Exam();
        //Act 
        String result = exam.calculateExam(answers);
        //Assert
        // assertEquals("2.0", result);

        if (answers.equals("B;A;C;D;B;B;A;C;B;A")) {
            assertEquals("3.0", result);  // Dostateczna
        } else if (answers.equals("B;B;C;D;B;A;B;C;B;A")) {
            assertEquals("3.5", result);  // Dostateczna plus
        } else if (answers.equals("B;B;B;B;B;B;B;B;B;B")) {
            assertEquals("5.0", result);  // Bardzo dobra
        } else if (answers.equals("_;_;_;_;_;_;_;_;_;_")) {
            assertEquals("2.0", result);  // Niedostateczna (brak odpowiedzi)
        } else if (answers.equals("A;C;D;A;C;D;A;C;D;A")) {
            assertEquals("2.0", result);  // Niedostateczna (wszystkie błędne)
        } else if (answers.equals("B;_;C;_;B;_;A;_;B;A")) {
            assertEquals("3.5", result);  // Dostateczna plus (częściowo prawidłowe odpowiedzi)
        }

    }
}

