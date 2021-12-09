package Quiz.Quiz_05;

import java.util.Scanner;

public class Q2_NestedTernary03 {

	public static void main(String[] args) {
		/*
		 * Soru 5 Kullanicidan bir sayi alin ve 
		 * sayi 3 basamakli ise "uc basamakli sayi",
		 * yoksa "Uc basamakli degil" yazdirin
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		
		double sayi=scan.nextDouble();
	
		System.out.println(sayi>=100 && sayi<=999 ? "uc Basamakli" : "uc Basamakli Degil");
		
		
		
		scan.close();
		
		
	}

}
