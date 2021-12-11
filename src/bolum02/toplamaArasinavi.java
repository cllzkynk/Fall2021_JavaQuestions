package bolum02 ;
import java.util.Scanner;

public class toplamaArasinavi {
	public static void main(String[] args) {

		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		// 0 <= Math.random < 1

		System.out.println(sayi1 + " + " + sayi2 + " = ?");

		Scanner klavye = new Scanner(System.in);

		int toplam = klavye.nextInt();

		System.out.println(sayi1 + sayi2 == toplam);// bu iki sayin�n toplam�n�n bizim girdi�imiz sayiya e�it olup
													// olmad���n� g�steriyor
		if (sayi1 + sayi2 == toplam) {
			System.out.println("do�ru cevap");
		} else {
			System.out.println("yanl�� cevap");
		}
	}

}
