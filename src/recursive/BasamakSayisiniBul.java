package recursive;

import java.util.Scanner;

public class BasamakSayisiniBul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayý Girin: ");
		int sayi = scan.nextInt();

		// basamak(sayi);
		System.out.println("Girilen sayi " + basamak(sayi) + " basamaklidir");
		scan.close();
	}

	private static int basamak(int sayi) {

		if (sayi % 10 < 1)
			return sayi;
		else
			return 1 + basamak(sayi / 10);
	}

}
