package Zadanie5.Main;

public class Rabat{
    public static void main (String args[]){
    }

    // Metoda obliczająca rabat w zależności od wartości zakupów i posiadania karty
    public static String jakiRabat(int zakupy, boolean czyKarta) {
        String rabatInfo="";
        if (czyKarta==false) {
            rabatInfo="Karta";
            return rabatInfo; // Jeśli klient nie ma karty
        }

        int obnizka = 0;

        // Oblicz rabat na podstawie wartości zakupów
        if (zakupy <= 100) {
            obnizka = 5;
        } else if (zakupy <= 200) {
            obnizka = 10;
        } else if (zakupy <= 300) {
            obnizka = 15;
        } else if (zakupy <= 400) {
            obnizka = 20;
        } else {
            obnizka = 25;
        }
        rabatInfo="Rabat wynosi " + obnizka + "%";
        return rabatInfo; // Zwróć rabat dla klientów z kartą
    }
}
