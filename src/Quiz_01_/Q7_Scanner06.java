package Quiz.Quiz_01;

import java.util.Scanner;

public class Q7_Scanner06 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk
		 * olusturarak asagidaki sekilde yazdirin 
		 * Isim - soyisim : Mehmet Memo
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a basiniz");
		
		String name=scan.next();
		String surname=scan.next();
		
		System.out.println("Isim - Soyisim : " + name + " " +surname); // Isim - Soyisim : Mehmet Memo
		
		scan.close();

	}

}
