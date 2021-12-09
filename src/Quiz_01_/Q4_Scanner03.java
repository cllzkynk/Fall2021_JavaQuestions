package Quiz.Quiz_01;

import java.util.Scanner;

public class Q4_Scanner03 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan yaricap isteyip 
		 * cemberin cevresini ve 
		 * dairenin alanini hesaplayip yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir yaricap uzunlugu giriniz : ");
		int r=scan.nextInt();
		double pi=3.14;
		System.out.println("Cemberin cevresi : " + (2*pi*r));
		System.out.println("Dairenin Alani : " + (pi*r*r));
		
		
		
		
		
		scan.close();
		

	}

}
