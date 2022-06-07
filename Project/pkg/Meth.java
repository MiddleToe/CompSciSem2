package pkg;
import java.util.Scanner;
import java.util.Random;


public class Meth {
	
	double purity;
	int cost;
	
	public Meth(Ingredient a, Ingredient b, Ingredient c){
		purity = (a.getValue() * b.getValue() * c.getValue())/1000;
	}

	public double getPurity(){
		return purity;
	}
	
	//cost for 1 ounce
	public int equatePrice(){
		if(purity<=1){
			cost = 5;
			return cost;
		}
		else{
			cost = (int)purity*20;
			return cost;
		}
	}
		
}

