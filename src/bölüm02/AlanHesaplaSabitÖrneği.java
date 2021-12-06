package bölüm02;

import java.util.Scanner;

public class AlanHesaplaSabitÖrneði {
	public static void main(String[] args) {

		final double PI = 3.14159;
		Scanner girdi = new Scanner(System.in);

		double yarýcap;
		double alan;


		// yarýcapý oku
		System.out.println("Alaný hesaplanacak çemberin yarýçapýný giriniz ");
		yarýcap = girdi.nextDouble();
		
		// alaný hesapla
		alan = yarýcap * yarýcap * PI;

		// alaný yazdýr
		System.out.println("yarýcapý " + yarýcap + " olan çemberin alaný:" + alan + " dýr");

	}
}
