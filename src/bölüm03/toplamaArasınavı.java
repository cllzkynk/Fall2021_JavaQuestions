package b�l�m03;
import java.util.Scanner;

public class toplamaAras�nav� {
	public static void main(String[] args) {

		int say�1 = (int) (Math.random() * 10);
		int say�2 = (int) (Math.random() * 10);
		// 0 <= Math.random < 1

		System.out.println(say�1 + " + " + say�2 + " = ?");

		Scanner klavye = new Scanner(System.in);

		int toplam = klavye.nextInt();

		System.out.println(say�1 + say�2 == toplam);// bu iki say�n�n toplam�n�n bizim girdi�imiz say�ya e�it olup
													// olmad���n� g�steriyor
		if (say�1 + say�2 == toplam) {
			System.out.println("do�ru cevap");
		} else {
			System.out.println("yanl�� cevap");
		}
	}

}
