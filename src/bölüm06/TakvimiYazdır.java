package bölüm06;

import java.util.Scanner;

public class TakvimiYazdır {
	public static void main(String[] args) {
		System.out.println("Lütfen yılı giriniz (Ör. 2001):");
		Scanner java = new Scanner(System.in);
		int yıl = java.nextInt();

		System.out.println("Lütfen 1 ile 12 arasında bir ay girin");
		int ay = java.nextInt();

		takvimiYazdır(yıl, ay);
	}

	private static void takvimiYazdır(int yıl, int ay) {
		takvimBaslığınıYazdır(yıl, ay);

		takvimGövdesiniYazdır(yıl, ay);
	}

	private static void takvimBaslığınıYazdır(int yıl, int ay) {
		String ayınAdı = ayınİsminiBul(ay);
		System.out.println("         " + ayınAdı + " " + yıl);
		System.out.println("---------------------------");
		System.out.println(" Pzt Sal Çar Per Cum Cmt Pz");
	}

	private static String ayınİsminiBul(int ay) {
		switch (ay) {
		case 1:
			return "Ocak";
		case 2:
			return "Şubat";
		case 3:
			return "Mart";
		case 4:
			return "Nisan";
		case 5:
			return "Mayıs";
		case 6:
			return "Haziran";
		case 7:
			return "Temmuz";
		case 8:
			return "Ağustos";
		case 9:
			return "Eylül";
		case 10:
			return "Ekim";
		case 11:
			return "Kasım";
		case 12:
			return "Aralık";

		}
		return null;
	}

	private static void takvimGövdesiniYazdır(int yıl, int ay) {
		int baslangıcGünü = başlangıçGününüBul(yıl, ay);

		int aydakiGünSayısı = birAydakiGünSayısınıBul(yıl, ay);

		for (int i = 0; i < baslangıcGünü; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= aydakiGünSayısı; i++) {
			System.out.printf("%4d", i);
			baslangıcGünü++;
			if (baslangıcGünü % 7 == 0) {
				System.out.println();

			}

		}
	}

	private static int başlangıçGününüBul(int yıl, int ay) {
		final int Ocak_1_1800_GUNU = 6;
		int toplamGün = toplamGünSayısınıBul(yıl, ay);
		return (toplamGün + Ocak_1_1800_GUNU) % 7;

	}

	private static int toplamGünSayısınıBul(int yıl, int ay) {
		int toplamGün = 0;

		for (int i = 1800; i < yıl; i++) {
			toplamGün += artıkYılMı(i) ? 366 : 365;
		}

		for (int i = 1; i <= ay; i++) {
			toplamGün += birAydakiGünSayısınıBul(yıl, i);

		}
		return toplamGün;
	}

	public static int birAydakiGünSayısınıBul(int yıl, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
			return 31;

		if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
			return 30;

		if (ay == 2)
			return artıkYılMı(yıl) ? 29 : 28;

		return 0; // If month is incorrect
	}

	private static boolean artıkYılMı(int yıl) {
		return (yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0);
	}

}
