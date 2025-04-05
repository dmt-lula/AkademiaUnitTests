package Zadanie7.Test;

import java.security.KeyFactory;

public class CardGame{
    public static void main (String args[])
        {
            // String[] deckAdam = {"K","J","A"};
            // String[] deckMati = {"8","7","6"};
            // winner(deckAdam, deckMati);
        }



        public static String winner(String[]deckAdam, String[]deckMati){
            String karty = "23456789TJQKA";
            String wynik = "";
            int pointsAdam = 0;
            int pointsMati = 0;

            for (int i=0; i<=2; i++) {
                if(karty.indexOf(deckAdam[i])>karty.indexOf(deckMati[i]))
                    pointsAdam++;
                else if (karty.indexOf(deckAdam[i])<karty.indexOf(deckMati[i])){
                    pointsMati++;
                }
                else if (karty.indexOf(deckAdam[i])==karty.indexOf(deckMati[i])){
                }
                else{
                    throw new IllegalArgumentException("Błędne dane");
                }
            }
            if(pointsAdam==pointsMati){
                wynik="Remis";
            }else if (pointsAdam>pointsMati) {
                wynik="Adam wygrywa " + pointsAdam + " do " + pointsMati;
            }else{
                wynik="Mati wygrywa " + pointsMati + " do " + pointsAdam;
            }
            // System.out.println(wynik);
            return  wynik;
        }
    }
