package bölüm03;

import java.util.Scanner;

public class ÇýkartmaArasýnavý {
	public static void main(String[] args) {
		int sayý1 = (int) (Math.random() * 10);
		int sayý2 = (int) (Math.random() * 10);
		System.out.println(sayý1 + " - " + sayý2 + " = ?");

		Scanner klavye = new Scanner(System.in);
		int sonuç = klavye.nextInt();

		if (sayý2 > sayý1) { // eðer sonucun pozitif çýkmasýný istiyorsak
			int temp = sayý1;// swap ,yer deðiþikliði,yapýyoruz..
			sayý1 = sayý2;
			sayý2 = temp;
		}

		if (sonuç == sayý1 - sayý2) {
			System.out.println("Tebrikler,bildiniz");
		} else {
			System.out.println("Yanlýþ cevap.Doðru cevap :" + " = " + (sayý1 - sayý2));

		}
	}

}
