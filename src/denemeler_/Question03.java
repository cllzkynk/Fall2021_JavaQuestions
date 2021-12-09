package day02;

import java.util.Scanner;


public class Question03 {
	/* Write a return method that accepts an integer as input
	 * and calculates factorial and prints like output
	 *
	 * Eg : Input : 6
	 *      Output: 6!=6*5*4*3*2*1=720
	 */
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int input = scan.nextInt();
		faktoriyel(input);
		
	}
	
	public static void faktoriyel(int sayi){
		int carpim = 1;
		for(int i = sayi; i>0; i--){
			carpim *= i;
		}
		
		System.out.print(sayi + "!=");
		while(sayi>0){
			if(sayi!=1){
				System.out.print(sayi + "*");
				
			}else{
				System.out.print(sayi);
			}
			sayi--;
		}
		
		System.out.println(" = " + carpim);
		
	}
	
	
}
