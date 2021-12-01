package recursive;

import java.util.Scanner;

public class UcuncuKevvetleriAl {

	static long sonuc = 0;
	static int kontrol = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hangi sayinin kuvvetleri alinsin:   ");
		int sayi = scan.nextInt();
		System.out.print("kac adim istiyon: ");
		int adim = scan.nextInt();

		kuvvet(adim, sayi);
		scan.close();
	}

	private static long kuvvet(int adim, int sayi) {

		if (kontrol <= adim)

		{

			sonuc = (long) Math.pow(sayi, kontrol);

			kontrol++;
			System.out.print(sonuc + " ");
			kuvvet(adim, sayi);

		}
		return (long) sonuc;

	}

}
