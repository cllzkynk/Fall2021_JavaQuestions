package Quiz.Quiz_01;

import java.util.Scanner;

public class Q2_Scanner01 {

	public static void main(String[] args) {
		/*
		 * Soru 1)  Kullanicidan iki tamsayi alip 
		 * bu sayilarin toplam,fark ve carpimlarini yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir tamsayi giriniz : ");
		int sayi1=scan.nextInt();
		System.out.print("Lutfen bir tamsayi daha giriniz : ");
		int sayi2=scan.nextInt();

		
		System.out.println("Toplamasi : " + (sayi1+sayi2));
		System.out.println("Farki : " + (sayi1-sayi2));
		System.out.println("Carpimlari : " + (sayi1*sayi2));
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
