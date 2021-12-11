package bolum02 ;

import java.util.Scanner;

public class ArtikYil {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("L�tfen bir y�l giriniz");
		int yil = klavye.nextInt();

		boolean artikYilmi = yil % 4 == 0;

		artikYilmi = artikYilmi && yil % 100 != 0;

		artikYilmi = artikYilmi || yil % 400 == 0;
		
		artikYilmi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0); //T�m i�lem bir sat�rda yap�ld�..

		if (artikYilmi) {
			System.out.println(yil + " art�k y�ld�r.");
		} else {
			System.out.println(yil + " art�k y�lde�ildir");
		}

	}

}
