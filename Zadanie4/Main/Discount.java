package Zadanie4.Main;
public class Discount{
    public static void main (String args[])
        {
        }
        public double calculateDiscount(double price){
            double rabat;
            if (price<0){
                System.out.println("Cena nie moze byc mniejsza od zero");
            }
            else if (price<=5000){
                return rabat=0;
            }
            else if(price<=15000){
                return rabat=30;
            }
            else if(price<=15000){
                return rabat=40;
            }
            else if(price>50000){
                return rabat=80;
            }
            else{
                System.out.println("Niepoprawne dane");
            }
            return rabat=0;
        }

    }