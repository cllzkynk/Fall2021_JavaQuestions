package b�l�m05;

import java.util.Scanner;

public class Tekrarl�ToplamaAras�nav� {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		int say�1 = (int) (Math.random() * 10);
		int say�2 = (int) (Math.random() * 10);

		System.out.println(say�1 + " + " + say�2 + " =?");
		System.out.println("L�tfen bir integer say� girin");
		int cevap = java.nextInt();

		int yanl��Sayac� = 0;
		while (say�1 + say�2 != cevap && yanl��Sayac� < 2) {// ile s�n�rland�rd�k yanl�� girme hakk�n�
			yanl��Sayac�++;
			System.out.println("Yanl�� cevap girdiniz.Tekrar deneyiniz");
			cevap = java.nextInt();
			
		}
		if (say�1 + say�2 != cevap) {
			System.out.println("3 defa yanl�� girdiniz");
		} else {
			System.out.println("do�ru cevap");
		}
		java.close();
	}

}
