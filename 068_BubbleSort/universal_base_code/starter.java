import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] a= new int[200];
		
		for(int r = 0; r < 200; r++){
			a[r] = (int)(Math.random()*200)+1;
		}
		for(int x = 0; x < a.length-1; x++){
			for(int y = 0; y < a.length - x - 1; y++){
				if(a[y] > a[y+1]){
					int t = a[y];
					a[y] = a[y+1];
					a[y+1] = t;
				}
			}
		}
		for(int o = 0; o < 200; o++){
			System.out.print(a[o]+ " ");
		}


		
	}
}
