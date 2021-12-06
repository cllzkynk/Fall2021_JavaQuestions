package b�l�m06;

import java.util.Scanner;

public class TakvimiYazd�r {
	public static void main(String[] args) {
		System.out.println("L�tfen y�l� giriniz (�r. 2001):");
		Scanner java = new Scanner(System.in);
		int y�l = java.nextInt();

		System.out.println("L�tfen 1 ile 12 aras�nda bir ay girin");
		int ay = java.nextInt();

		takvimiYazd�r(y�l, ay);
	}

	private static void takvimiYazd�r(int y�l, int ay) {
		takvimBasl���n�Yazd�r(y�l, ay);

		takvimG�vdesiniYazd�r(y�l, ay);
	}

	private static void takvimBasl���n�Yazd�r(int y�l, int ay) {
		String ay�nAd� = ay�n�sminiBul(ay);
		System.out.println("         " + ay�nAd� + " " + y�l);
		System.out.println("---------------------------");
		System.out.println(" Pzt Sal �ar Per Cum Cmt Pz");
	}

	private static String ay�n�sminiBul(int ay) {
		switch (ay) {
		case 1:
			return "Ocak";
		case 2:
			return "�ubat";
		case 3:
			return "Mart";
		case 4:
			return "Nisan";
		case 5:
			return "May�s";
		case 6:
			return "Haziran";
		case 7:
			return "Temmuz";
		case 8:
			return "A�ustos";
		case 9:
			return "Eyl�l";
		case 10:
			return "Ekim";
		case 11:
			return "Kas�m";
		case 12:
			return "Aral�k";

		}
		return null;
	}

	private static void takvimG�vdesiniYazd�r(int y�l, int ay) {
		int baslang�cG�n� = ba�lang��G�n�n�Bul(y�l, ay);

		int aydakiG�nSay�s� = birAydakiG�nSay�s�n�Bul(y�l, ay);

		for (int i = 0; i < baslang�cG�n�; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= aydakiG�nSay�s�; i++) {
			System.out.printf("%4d", i);
			baslang�cG�n�++;
			if (baslang�cG�n� % 7 == 0) {
				System.out.println();

			}

		}
	}

	private static int ba�lang��G�n�n�Bul(int y�l, int ay) {
		final int Ocak_1_1800_GUNU = 6;
		int toplamG�n = toplamG�nSay�s�n�Bul(y�l, ay);
		return (toplamG�n + Ocak_1_1800_GUNU) % 7;

	}

	private static int toplamG�nSay�s�n�Bul(int y�l, int ay) {
		int toplamG�n = 0;

		for (int i = 1800; i < y�l; i++) {
			toplamG�n += art�kY�lM�(i) ? 366 : 365;
		}

		for (int i = 1; i <= ay; i++) {
			toplamG�n += birAydakiG�nSay�s�n�Bul(y�l, i);

		}
		return toplamG�n;
	}

	public static int birAydakiG�nSay�s�n�Bul(int y�l, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
			return 31;

		if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
			return 30;

		if (ay == 2)
			return art�kY�lM�(y�l) ? 29 : 28;

		return 0; // If month is incorrect
	}

	private static boolean art�kY�lM�(int y�l) {
		return (y�l % 4 == 0 && y�l % 100 != 0) || (y�l % 400 == 0);
	}

}
