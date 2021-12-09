package Quiz.Quiz_01;

import java.util.Scanner;

public class Q3_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin 
		 * ve karenin cevresini ve alanini hesaplayip yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir kenar uzunulugu giriniz : ");
		int sayi=scan.nextInt();
		
		System.out.println("Karenin cevresi : " + (sayi*4));
		System.out.println("Karenin Alan : " + (sayi*sayi));
		
		scan.close();
	}

}
