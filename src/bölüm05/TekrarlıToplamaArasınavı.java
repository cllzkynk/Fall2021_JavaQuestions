package bölüm05;

import java.util.Scanner;

public class TekrarlıToplamaArasınavı {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		int sayı1 = (int) (Math.random() * 10);
		int sayı2 = (int) (Math.random() * 10);

		System.out.println(sayı1 + " + " + sayı2 + " =?");
		System.out.println("Lütfen bir integer sayı girin");
		int cevap = java.nextInt();

		int yanlışSayacı = 0;
		while (sayı1 + sayı2 != cevap && yanlışSayacı < 2) {// ile sınırlandırdık yanlış girme hakkını
			yanlışSayacı++;
			System.out.println("Yanlış cevap girdiniz.Tekrar deneyiniz");
			cevap = java.nextInt();
			
		}
		if (sayı1 + sayı2 != cevap) {
			System.out.println("3 defa yanlış girdiniz");
		} else {
			System.out.println("doğru cevap");
		}
		java.close();
	}

}
