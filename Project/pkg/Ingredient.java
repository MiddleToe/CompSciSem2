package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ingredient {
	String name;
	double value;
	double volatility;
	double price;
	Random rand = new Random();

	public Ingredient(int x){
		if(x==1){
			name = "Acetic Acid";
			value = rand.nextDouble()*5;
		}
		else if(x==2){
			name = "Psuedoephedrine";
			value = (rand.nextDouble()*5)+5;
		}
		else if(x==3){
			name = "Muriatic Acid";
			value = (rand.nextDouble()*13)+10;
		}
		else if(x==4){
			name = "Methylamine";
			value = (rand.nextDouble()*9)+23;
		}
		else if(x==5){
			name = "Hydrochloric Acid";
			value = (rand.nextDouble()*6)+32;
		}
		else if(x==6){
			name = "Caustic Soda";
			value = (rand.nextDouble()*13)+38;
		}
		else if(x==7){
			name = "Potassium Fluoride";
			value = (rand.nextDouble()*7)+51;
		}
		else if(x==8){
			name = "Phenylacetic Acid";
			value = (rand.nextDouble()*7)+58;
		}
		else if(x==9){
			name = "Arsenic Trioxide";
			value = (rand.nextDouble()*6)+65;
		}
		else if(x==10){
			name = "Sodium Cyanide";
			value = (rand.nextDouble()*5)+71;
		}
		else if(x==11){
			name = "Botulinum Toxin";
			value = (rand.nextDouble()*7)+76;
		}
		else if(x==12){
			name = "Liquid Plutonium";
			value = (rand.nextDouble()*8)+83;
		}
	}
	

	
	public String getName(){
		return name;
	}
	
	public double getVolatility(){
		return volatility;
	}
	
	public double getPrice(){
		return price;
	}
	
	public double getValue(){
		return value;
	}
}


