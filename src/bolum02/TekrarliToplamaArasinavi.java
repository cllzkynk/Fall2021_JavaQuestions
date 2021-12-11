package bolum02;

import java.util.Scanner;

public class TekrarliToplamaArasinavi {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);

		System.out.println(sayi1 + " + " + sayi2 + " =?");
		System.out.println("L�tfen bir integer sayi girin");
		int cevap = java.nextInt();

		int yanlisSayaci = 0;
		while (sayi1 + sayi2 != cevap && yanlisSayaci < 2) {// ile s�n�rland�rd�k yanl�� girme hakk�n�
			yanlisSayaci++;
			System.out.println("Yanl�� cevap girdiniz.Tekrar deneyiniz");
			cevap = java.nextInt();
			
		}
		if (sayi1 + sayi2 != cevap) {
			System.out.println("3 defa yanl�� girdiniz");
		} else {
			System.out.println("do�ru cevap");
		}
		java.close();
	}

}
