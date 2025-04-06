package zadanie6cd.Main;


public class Exam{
  public static void main (String args[])
  {
  }

  public static String calculateExam(String studentAnswers, String correctAnswers){
    // Sprawdzamy odpowiedzi studenta i poprawne odpowiedzi
    String[] studentResponses = studentAnswers.split(";");
    String[] correctResponses = correctAnswers.split(";");

    int score = 0;

    // Przechodzimy przez odpowiedzi
    for (int i = 0; i < studentResponses.length; i++) {
        String studentAnswer = studentResponses[i];
        String correctAnswer = correctResponses[i];

        if (studentAnswer.equals("_")) {
            score -= 1;  // brak odpowiedzi to -1 punkt
        } else if (studentAnswer.equals(correctAnswer)) {
            score += 3;  // poprawna odpowiedź to +3 punkty
        } else {
            score -= 4;  // zła odpowiedź to -4 punkty
        }
    }

    // Obliczamy procent
    double percentage = (score / 30.0) * 100;  // Maksymalny wynik to 30 punktów

    // Określamy ocenę na podstawie procentów
    if (percentage < 51) {
        return "2.0";  // Niedostateczna
    } else if (percentage >= 51 && percentage <= 60) {
        return "3.0";  // Dostateczna
    } else if (percentage >= 61 && percentage <= 70) {
        return "3.5";  // Dostateczna plus
    } else if (percentage >= 71 && percentage <= 80) {
        return "4.0";  // Dobra
    } else if (percentage >= 81 && percentage <= 90) {
        return "4.5";  // Dobra plus
    } else {
        return "5.0";  // Bardzo dobra
    }
  }
}