package Quiz.Quiz_07;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		// Kullanicidan 2 tamsayi isteyin
		// bu sayilarin toplamlarini ve carpimlarini
		// iki ayri method'da hesaplayip yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		toplama(sayi1,sayi2);
		carpma (sayi1,sayi2);
		
		scan.close();
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi : " + (sayi1*sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Say�lar�n toplam� : " + (sayi1+sayi2));
		
	}

}
