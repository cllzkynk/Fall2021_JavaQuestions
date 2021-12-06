package bölüm06;

import java.util.Scanner;

public class OBEB {
	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);

		System.out.println("1. sayýyý giriniz");
		int sayý1 = java.nextInt();
		System.out.println("2. sayýyý giriniz");
		int sayý2 = java.nextInt();

		int obeb = obeb(sayý1, sayý2);
		System.out.println(obeb);
		java.close();
	}

	private static int obeb(int sayý1, int sayý2) {
		int obeb = 1;
		int bolen = 2;
		while (bolen <= sayý1 && bolen <= sayý2) {
			if (sayý1 % bolen == 0 && sayý2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;
		}

		return obeb;
	}
	

}
