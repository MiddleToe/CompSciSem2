package pkg;
import java.util.Scanner;
import java.util.Random;


public class Player {
	
	String name;
	int cash;
	
	
	public Player(String a) {
		name = a;
		cash = 100;
	}
	
	public void addCash(int a){
		cash = cash + a;
	}
	
	public int getCash(){
		return cash;
	}
	
	public String getName(){
		return name;
	}
}

