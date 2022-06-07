import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	
	Ingredient a = new Ingredient("Thorium Dioxide", 5);
	Ingredient b = new Ingredient("Phenylacetic Acid", 4);
	Ingredient c = new Ingredient("Acetic Acid", 1);
	Reaction q = new Reaction(b,c,a);
	Phenylacetone p = new Phenylacetone(q);
	System.out.println(p.getName() + " has been created, with a contamination of " + p.getContamination() + "%.");
	
	Ingredient m = new Ingredient("Ammonia",5);
	Ingredient n = new Ingredient("Methanol",5);
	Ingredient o = new Ingredient("Aluminosilicate",5);
	Reaction r = new Reaction(m,n,o);
	Methylamine g = new Methylamine(r);
	System.out.println(g.getName() + " has been created with a contamination of " + g.getContamination() + "%.");
	
	
	Meth y = new Meth(p,g);
	System.out.println(y.getAmount());
	System.out.println(y.getPrice());




	
	
	}
}

