package bolum02_�l�m02;

import java.util.Scanner;

public class Zaman�G�ster {
	public static void main(String[] args) {
		System.out.println("Saaniye cinsinden bir tam say� girniz");

		Scanner klavye = new Scanner(System.in);
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir");
	}

}
