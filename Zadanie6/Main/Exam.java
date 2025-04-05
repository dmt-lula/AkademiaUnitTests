package Zadanie6.Main;
public class Exam{
    public static void main (String args[]){
    }
    public String calculateExam(String answers){
      String[] answerArray = answers.split(";");
      int totalPoints = 0;

      // Klucz odpowiedzi - zakładamy, że odpowiedź B jest zawsze poprawna
      String correctAnswer = "B";

      // Iterujemy przez odpowiedzi studenta
      for (String answer : answerArray) {
          if (answer.equals(correctAnswer)) {
              totalPoints += 3;  // Poprawna odpowiedź
          } else if (answer.equals("_")) {
              totalPoints -= 1;  // Brak odpowiedzi
          } else {
              totalPoints -= 4;  // Błędna odpowiedź
          }
      }

      // Obliczamy procentowy wynik
    //   double percentage = (totalPoints + 40) / 60.0 * 100;
      double percentage = (totalPoints / 30.0) * 100;

      // Zwracamy ocenę na podstawie procentów
      if (percentage < 51) {
          return "2.0";  // Niedostateczny
      } else if (percentage >= 51 && percentage <= 60) {
          return "3.0";  // Dostateczny
      } else if (percentage >= 61 && percentage <= 70) {
          return "3.5";  // Dostateczny plus
      } else if (percentage >= 71 && percentage <= 80) {
          return "4.0";  // Dobry
      } else if (percentage >= 81 && percentage <= 90) {
          return "4.5";  // Dobry plus
      } else {
          return "5.0";  // Bardzo dobry
      }
      // return "xx";
    }
}