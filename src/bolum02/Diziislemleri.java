package bolum02 ;

import java.util.Arrays;
import java.util.Scanner;

public class Diziislemleri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunlugu = 2;
		int[] dizi = new int[dizininUzunlugu];

		System.out.println("L�tfen " + dizi.length + " tane Sayi giriniz");
		{
			for (int i = 0; i < dizi.length; i++) {
				dizi[i] = scan.nextInt();
			}
		}
		System.out.println(Arrays.toString(dizi));
		System.out.println("�nce " + dizi[0]);
		dizi = new int[100];
		int toplamSayi = 0;
		System.out.println("sonra " + dizi[0]);
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
			toplamSayi += dizi[i];
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println("Dizinin de�erlerinin toplam� : " + toplamSayi);

		// Dizinin en Buyuk elaman�n� bulal�m
		// Dizinin en Buyuk eleman�n en k���k indexini bulal�m
		int enBuyukEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en Buyuk eleman� : " + enBuyukEleman);
		System.out.println("Dizinin en Buyuk eleman�n indexi : " + index);

		// Dizi rassal bir �ekilde kar��t�rl�yor
		for (int i = 0; i < dizi.length; i++) {
			int rassalindex = (int) (Math.random() * dizi.length);
			int gecici = dizi[i];
			dizi[i] = dizi[rassalindex];
			dizi[rassalindex] = gecici;
		}
		diziyiyazma(dizi);
		System.out.println();

		// Dizinin elemanlar�n� sola kayd�r
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
		
		diziyiyazma(dizi);
	}

	private static void diziyiyazma(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		// TODO Auto-generated method stub
		
	}
}
