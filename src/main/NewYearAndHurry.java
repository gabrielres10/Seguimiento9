package main;

import java.util.ArrayList;
import java.util.Scanner;

public class NewYearAndHurry {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i<10; i++) {
			int time = 5*i;
			arr.add(time);
			
		}
		
		int n = sc.nextInt();	
		int k = sc.nextInt();
		
		int regreso =240-k;
		int index = 0;
		if(1<=n && n<=10) {
			if(1<=k && k<=240) {			
				index = binSearch(arr,regreso,n);

			}
		}
		System.out.println(index);	
	}
		

	public static int binSearch(ArrayList<Integer>arr, int regreso, int n) {
		int inte = 0;
		
				for(int a : arr) {
					
					if(regreso>225) {
						return n;
					}else if(regreso==a){
						inte = inte+1;
						return inte;
					}else if(regreso<=a){
						return inte;
					}else if(regreso>=a) {
						regreso = regreso-a;
						inte = inte+1;
					}	
				}

		return 0;
		
	}
}