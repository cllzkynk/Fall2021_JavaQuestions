package Quiz.Quiz_01;

import java.util.Scanner;

public class Q5_Scanner04 {

	public static void main(String[] args) {
		/*Soru 4) Kullanicidan dikdortgenler prizmasinin 
		 * uzun, kisa kenarlarini ve yuksekligini isteyip 
		 * prizmanin hacmini hesaplayip yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen Prizmanin uzun kenarini giriniz : ");
		int kisakenar=scan.nextInt();
		System.out.print("Lutfen Prizmanin kisa kenarini giriniz : ");
		int uzunkenar=scan.nextInt();
		System.out.print("Lutfen Prizmann yuksekligini giriniz : ");
		int yukseklik=scan.nextInt();
		
		// Prizmanin Hacmi = uzun*kisa*yukseklik
		System.out.println("Prizmanin Hacmi : " + (kisakenar*uzunkenar*yukseklik));
	
		scan.close();
		
	}

}
