package bölüm07;

import java.util.Arrays;
import java.util.Scanner;

public class DiziÝþlemleriMetotForeach {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunluðu = 10;
		int[] dizi = new int[dizininUzunluðu];

			
		
		diziyiRassalSayýlarlaDoldur(dizi);
		
		diziyiYazdýr(dizi);	
		System.out.println();
		
		dizininToplamýnýBul(dizi);

		dizininEnBüyükElemanýnýVeÝndeksiniBul(dizi);

		diziyiKarýþtýr(dizi);
		System.out.println();
		
		diziyiYazdýr(dizi);
		
		diziyiSolakaydýr(dizi);
		System.out.println();
		
		diziyiYazdýr(dizi);
	}
	public static void diziyiSolakaydýr(int[] dizi) {
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
	}

	public static void diziyiKarýþtýr(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int rassalÝndex = (int) (Math.random() * dizi.length);
			int geçici = dizi[i];
			dizi[i] = dizi[rassalÝndex];
			dizi[rassalÝndex] = geçici;
		}
	}

	public static void dizininEnBüyükElemanýnýVeÝndeksiniBul(int[] dizi) {
		int enBüyükEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enBüyükEleman < dizi[i]) {
				enBüyükEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en büyük elemaný : " + enBüyükEleman);
		System.out.println("Dizinin en büyük elemanýn indexi : " + index);
	}

	public static void dizininToplamýnýBul(int[] dizi) {
		int toplam = 0;
		for (int sayý : dizi) {
			toplam += sayý;
		}
		System.out.println("Dizideki elemanlarýn toplamý : " + toplam);
	}

	public static void diziyiYazdýr(int[] dizi) {
		int satýrSayacý = 0;
		for (int sayý : dizi) {
			satýrSayacý ++;
			System.out.printf("%3d", sayý);
			if (satýrSayacý % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static void diziyiRassalSayýlarlaDoldur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}

}
