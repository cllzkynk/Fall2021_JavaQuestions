package recursive;

import java.util.Scanner;

public class RakamlarToplami {

	public static void main(String[] args) {
		int sayi, sonuc;

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Say� Girin: ");
		sayi = scan.nextInt();

		sonuc = rakamlarToplami(sayi);

		System.out.println(sayi + " say�s�n�n rakamlar� toplam�  " + sonuc);

	scan.close();}

	private static int rakamlarToplami(int sayi) {
		if (sayi != 0) {
			return (sayi % 10 + rakamlarToplami(sayi / 10));
		} else {
			return 0;
		}
	}
}
