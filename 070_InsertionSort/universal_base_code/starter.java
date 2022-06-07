import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] a = new int [200];
		
		for(int x = 0; x < a.length; x++){
			a[x] = (int)(Math.random()*200)+1;
		}
		
		int outer, inner, k;
		for(outer = 1; outer < a.length; outer++){
			k = a[outer];
			inner = outer-1;
			
		while(inner >= 0 && a[inner] > k){
			a[inner+1] = a[inner];
			inner = inner -1;
		}	
		a[inner + 1] = k;
		}
		for(int r = 0; r < 200; r++){
			System.out.print(a[r] + " ");
		}
	}
}
