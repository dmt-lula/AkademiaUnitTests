package Zadanie2.Main;
public class Premia{
public static void main (String args[])
	{
	 
	}
	public int ppremia (int staz){
		int premia;
		if (staz < 4){
			premia=0;
		}
		else if(staz<=8){
			premia = 50;
		}
		else if(staz<=11) {
			premia = 70;
		}
		else if(staz<=70){
			premia = 100;
		}
		else premia=0;
		return premia;
	}
}