package main;

import java.util.Scanner;
 
public class ProgrammersAndMathematicians {
 
	public static Scanner sc = new Scanner(System.in);
	
    public static int aux;
 
	public static void main(String[] args) {
 
		int casos = sc.nextInt();
		
		while(casos > 0) {
		    aux = 0;
		    int[] array = {sc.nextInt(), sc.nextInt()};
		    counter(array);
	        System.out.println(aux);
	        casos--;
		}
	}
	
	
	public static void counter(int[] array){
    	if(array[0] == 0 || array[1] == 0) {
    	    aux = aux + 0;
		}else if(array[0] < 2 && array[1] < 2){
		     aux = aux + 0;
		}else if(array[0] == 1 || array[1] == 1) {
			aux++;
		}else if(array[0] == array[1]) {
		    aux = aux + array[0]/2;
		}else{
		    if(array[0]>array[1]){
		        array[0] = array[0]-3;
		        array[1]--;
		        aux++;
		        counter(array);
		    }else{
		        array[1] = array[1]-3;
		        array[0]--;
		        aux++;
		        counter(array);
		    }
		}
	}
}