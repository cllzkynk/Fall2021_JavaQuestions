package bolum02  ;

import java.util.Scanner;

public class CikartmaArasinavi {
	public static void main(String[] args) {
		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		System.out.println(sayi1 + " - " + sayi2 + " = ?");

		Scanner klavye = new Scanner(System.in);
		int sonuc = klavye.nextInt();

		if (sayi2 > sayi1) { // e�er sonucun pozitif ��kmas�n� istiyorsak
			int temp = sayi1;// swap ,yer de�i�ikli�i,yap�yoruz..
			sayi1 = sayi2;
			sayi2 = temp;
		}

		if (sonuc == sayi1 - sayi2) {
			System.out.println("Tebrikler,bildiniz");
		} else {
			System.out.println("Yanl�� cevap.Do�ru cevap :" + " = " + (sayi1 - sayi2));

		}
	}

}
