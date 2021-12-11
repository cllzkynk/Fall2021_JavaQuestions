package bolum02_�l�m02;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Y�ll�k faiz oran�n� giriniz: (�r. 4.5) ");
		double y�ll�kFaizOran� = klavye.nextDouble();

		System.out.println("Ka� y�lda �demek istiyorsunuz: (�r. 5)");
		int y�l = klavye.nextInt();

		System.out.println("Bor� al�nacak miktar: (�r. 157,98)");
		double bor�Miktar� = klavye.nextDouble();

		double ayl�kFaizOran� = y�ll�kFaizOran� / 1200;

		double ayl�k�demeMiktar� = (bor�Miktar� * ayl�kFaizOran�) / (1 - (1 / Math.pow(1 + ayl�kFaizOran�, y�l * 12)));

		double toplamBor� = ayl�k�demeMiktar� * 12 * y�l;

		System.out.println("Ayl�k �deme miktar� : " + (int) (ayl�k�demeMiktar� * 100) / 100.0);// 100.0 a b�l�n�rse
																								// sonu� noktal�
																								// ��kar.�OK �NEML�
		System.out.println("tOPLAM �DECEK M�KTAR : " + (int) (toplamBor� * 100) / 100.0);

	}

}
