package b�l�m03;

import java.util.Scanner;

public class ��kartmaAras�nav� {
	public static void main(String[] args) {
		int say�1 = (int) (Math.random() * 10);
		int say�2 = (int) (Math.random() * 10);
		System.out.println(say�1 + " - " + say�2 + " = ?");

		Scanner klavye = new Scanner(System.in);
		int sonu� = klavye.nextInt();

		if (say�2 > say�1) { // e�er sonucun pozitif ��kmas�n� istiyorsak
			int temp = say�1;// swap ,yer de�i�ikli�i,yap�yoruz..
			say�1 = say�2;
			say�2 = temp;
		}

		if (sonu� == say�1 - say�2) {
			System.out.println("Tebrikler,bildiniz");
		} else {
			System.out.println("Yanl�� cevap.Do�ru cevap :" + " = " + (say�1 - say�2));

		}
	}

}
