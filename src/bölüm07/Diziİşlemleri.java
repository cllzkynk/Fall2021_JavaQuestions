package bölüm07;

import java.util.Arrays;
import java.util.Scanner;

public class DiziÝþlemleri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunluðu = 2;
		int[] dizi = new int[dizininUzunluðu];

		System.out.println("Lütfen " + dizi.length + " tane sayý giriniz");
		{
			for (int i = 0; i < dizi.length; i++) {
				dizi[i] = scan.nextInt();
			}
		}
		System.out.println(Arrays.toString(dizi));
		System.out.println("Önce " + dizi[0]);
		dizi = new int[100];
		int toplamSayý = 0;
		System.out.println("sonra " + dizi[0]);
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
			toplamSayý += dizi[i];
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println("Dizinin deðerlerinin toplamý : " + toplamSayý);

		// Dizinin en büyük elamanýný bulalým
		// Dizinin en büyük elemanýn en küçük indexini bulalým
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

		// Dizi rassal bir þekilde karýþtýrlýyor
		for (int i = 0; i < dizi.length; i++) {
			int rassalÝndex = (int) (Math.random() * dizi.length);
			int geçici = dizi[i];
			dizi[i] = dizi[rassalÝndex];
			dizi[rassalÝndex] = geçici;
		}
		diziyiyazma(dizi);
		System.out.println();

		// Dizinin elemanlarýný sola kaydýr
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
