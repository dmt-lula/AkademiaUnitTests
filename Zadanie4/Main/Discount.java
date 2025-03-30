package Zadanie4.Main;
public class Discount{
    public static void main (String args[])
        {
        }


        public double calculateDiscount(double wartosc){
            double rabat=0;
            double dokladnosc=100.0; // 2 miejsca po przecinku

            if (wartosc<0){
                throw new IllegalArgumentException("Cena nie moze byc mniejsza od zero");
            }
            else if (wartosc<=5000){
                rabat=0;
            }
            else if(wartosc<=15000){
                rabat=30;
            }
            else if(wartosc<=50000){
                rabat=40;
            }
            else{
                rabat=80;
            }
            double suma = wartosc - (wartosc * (rabat / dokladnosc));
            double sumaDec = Math.round(suma * dokladnosc) / dokladnosc;
            return sumaDec;
        }



    }