
import java.util.*;

class starter {
	
	public static void bubbleSort(ArrayList <Integer> arr){
		for(int x = 0; x < arr.size()-1; x++){
			for(int y = 0; y < arr.size() - x - 1; y++){
				if(arr.get(y) > arr.get(y+1)){
					int t = arr.get(y);
					arr.set(y,arr.get(y+1));
					arr.set(y+1,t);
				}
			}
		}
	}
	
	public static void selectionSort(ArrayList <Integer> arr){
		for(int x = 0; x < arr.size(); x++){
			int min = x;
			for(int y = x+1; y < arr.size(); y++){
				if(arr.get(y) < arr.get(min)){
					min = y;
				}
			}
			int e = arr.get(x);
			arr.set(x,arr.get(min));
			arr.set(min,e);
		}
	}
	
	public static void insertionSort(ArrayList <Integer> arr){
		int o, i, k;
		for(o = 1; o < arr.size(); o++){
			k = arr.get(o);
			i = o -1;
			
		while(i >= 0 && arr.get(i) > k){
			arr.set(i+1,arr.get(i));
			i = i -1;
		}	
		arr.set(i+1,k);
		}
	}
	
	public static void main(String args[]) {
		ArrayList <Integer> a1 = new ArrayList <Integer>();
		ArrayList <Integer> a2 = new ArrayList <Integer>();
		ArrayList <Integer> a3 = new ArrayList <Integer>();
	
		for(int q = 0; q < 100; q++){
			int a = (int)(Math.random()*100)+1;
			a1.add(q,a);
			a2.add(q,a);
			a3.add(q,a);
		}
		
		bubbleSort(a1);
		selectionSort(a2);
		insertionSort(a3);
		
		System.out.println((a1.get(49) + a1.get(50))/2);
		System.out.println((a2.get(49) + a2.get(50))/2);
		System.out.println((a3.get(49) + a3.get(50))/2);
		
	}
}
