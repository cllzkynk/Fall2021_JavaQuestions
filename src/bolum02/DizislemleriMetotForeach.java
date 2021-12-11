package bolum02 ;

import java.util.Arrays;
import java.util.Scanner;

public class DizislemleriMetotForeach {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunlugu = 10;
		int[] dizi = new int[dizininUzunlugu];

			
		
		diziyiRassalSayilarlaDoldur(dizi);
		
		diziyiYazdir(dizi);	
		System.out.println();
		
		dizininToplaminiBul(dizi);

		dizininEnbuyukElemaniniVeindeksiniBul(dizi);

		diziyiKaristir(dizi);
		System.out.println();
		
		diziyiYazdir(dizi);
		
		diziyiSolakaydir(dizi);
		System.out.println();
		
		diziyiYazdir(dizi);
	}
	public static void diziyiSolakaydir(int[] dizi) {
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
	}

	public static void diziyiKaristir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int rassalindex = (int) (Math.random() * dizi.length);
			int gecici = dizi[i];
			dizi[i] = dizi[rassalindex];
			dizi[rassalindex] = gecici;
		}
	}

	public static void dizininEnbuyukElemaniniVeindeksiniBul(int[] dizi) {
		int enbuyukEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enbuyukEleman < dizi[i]) {
				enbuyukEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en buyuk eleman� : " + enbuyukEleman);
		System.out.println("Dizinin en buyuk eleman�n indexi : " + index);
	}

	public static void dizininToplaminiBul(int[] dizi) {
		int toplam = 0;
		for (int sayi : dizi) {
			toplam += sayi;
		}
		System.out.println("Dizideki elemanlar�n toplam� : " + toplam);
	}

	public static void diziyiYazdir(int[] dizi) {
		int satirSayaci = 0;
		for (int sayi : dizi) {
			satirSayaci ++;
			System.out.printf("%3d", sayi);
			if (satirSayaci % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static void diziyiRassalSayilarlaDoldur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}

}
