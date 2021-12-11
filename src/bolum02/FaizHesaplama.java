package bolum02 ;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Y�ll�k faiz oran�n� giriniz: (�r. 4.5) ");
		double yillikFaizOrani = klavye.nextDouble();

		System.out.println("Ka� y�lda �demek istiyorsunuz: (�r. 5)");
		int yil = klavye.nextInt();

		System.out.println("Bor� al�nacak miktar: (�r. 157,98)");
		double borcMiktari = klavye.nextDouble();

		double aylikFaizOrani = yillikFaizOrani / 1200;

		double aylikodemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));

		double toplamBorc = aylikodemeMiktari * 12 * yil;

		System.out.println("aylik �deme miktar� : " + (int) (aylikodemeMiktari * 100) / 100.0);// 100.0 a b�l�n�rse
																								// sonu� noktal�
																								// ��kar.�OK �NEML�
		System.out.println("tOPLAM �DECEK M�KTAR : " + (int) (toplamBorc * 100) / 100.0);

	}

}
