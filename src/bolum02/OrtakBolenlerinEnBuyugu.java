package bolum02 ;

import java.util.Scanner;

public class OrtakBolenlerinEnBuyugu {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);

		System.out.println("1. sayiy� giriniz");
		int sayi1 = java.nextInt();
		System.out.println("2. sayiy� giriniz");
		int sayi2 = java.nextInt();

		int obeb = 1;
		int bolen = 2;
		while (bolen <= sayi1 && bolen <= sayi2) {
			if (sayi1 % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;
		}
		System.out.println(obeb);
		java.close();
	}
}
