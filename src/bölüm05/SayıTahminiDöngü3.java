package bölüm05;

import java.util.Scanner;

public class SayıTahminiDöngü3 {
	public static void main(String[] args) {
		int sayı = (int) (Math.random() * 101);

		Scanner java = new Scanner(System.in);
		System.out.println("0 ile 100 arasında bir sayı girin");
		int tahmin = java.nextInt();

		while (sayı != tahmin) {

			if (sayı < tahmin) {
				System.out.println("Büyük bir sayı girdiniz.Tekrar deneyiniz");
				tahmin = java.nextInt();
			} else {
				System.out.println("Küçük bir sayı girdiniz.Tekrar giriniz");
				tahmin = java.nextInt();
			}

		}
		System.out.println("bildiniz..sayı : " + sayı);
		java.close();
	}

}
