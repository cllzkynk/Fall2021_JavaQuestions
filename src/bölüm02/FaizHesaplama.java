package bölüm02;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Yýllýk faiz oranýný giriniz: (Ör. 4.5) ");
		double yýllýkFaizOraný = klavye.nextDouble();

		System.out.println("Kaç yýlda ödemek istiyorsunuz: (Ör. 5)");
		int yýl = klavye.nextInt();

		System.out.println("Borç alýnacak miktar: (Ör. 157,98)");
		double borçMiktarý = klavye.nextDouble();

		double aylýkFaizOraný = yýllýkFaizOraný / 1200;

		double aylýkÖdemeMiktarý = (borçMiktarý * aylýkFaizOraný) / (1 - (1 / Math.pow(1 + aylýkFaizOraný, yýl * 12)));

		double toplamBorç = aylýkÖdemeMiktarý * 12 * yýl;

		System.out.println("Aylýk ödeme miktarý : " + (int) (aylýkÖdemeMiktarý * 100) / 100.0);// 100.0 a bölünürse
																								// sonuç noktalý
																								// çýkar.ÇOK ÖNEMLÝ
		System.out.println("tOPLAM ÖDECEK MÝKTAR : " + (int) (toplamBorç * 100) / 100.0);

	}

}
