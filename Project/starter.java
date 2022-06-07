import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	
	
	Ingredient f = new Ingredient(12);
	Ingredient b = new Ingredient(12);
	Ingredient c = new Ingredient(12);
	Meth g = new Meth(f,b,c);
	System.out.println("You have produced 1 ounce of meth with a purity of " + g.getPurity() + "%.");
	System.out.println("Your meth is valued at " + g.equatePrice() + " dollars.");
	}
}

