package b�l�m03;

import java.util.Scanner;

public class Art�kY�l {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("L�tfen bir y�l giriniz");
		int y�l = klavye.nextInt();

		boolean art�kY�lm� = y�l % 4 == 0;

		art�kY�lm� = art�kY�lm� && y�l % 100 != 0;

		art�kY�lm� = art�kY�lm� || y�l % 400 == 0;
		
		art�kY�lm� = (y�l % 4 == 0 && y�l % 100 != 0) || (y�l % 400 == 0); //T�m i�lem bir sat�rda yap�ld�..

		if (art�kY�lm�) {
			System.out.println(y�l + " art�k y�ld�r.");
		} else {
			System.out.println(y�l + " art�k y�lde�ildir");
		}

	}

}
