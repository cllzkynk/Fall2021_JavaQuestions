package bolum02�l�m02;

import java.util.Scanner;

public class OBEB {
	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);

		System.out.println("1. say�y� giriniz");
		int say�1 = java.nextInt();
		System.out.println("2. say�y� giriniz");
		int say�2 = java.nextInt();

		int obeb = obeb(say�1, say�2);
		System.out.println(obeb);
		java.close();
	}

	private static int obeb(int say�1, int say�2) {
		int obeb = 1;
		int bolen = 2;
		while (bolen <= say�1 && bolen <= say�2) {
			if (say�1 % bolen == 0 && say�2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;
		}

		return obeb;
	}
	

}
