package bölüm02;

import java.util.Scanner;

public class ZamanıGöster {
	public static void main(String[] args) {
		System.out.println("Saaniye cinsinden bir tam sayı girniz");

		Scanner klavye = new Scanner(System.in);
		int saniye = klavye.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir");
	}

}
