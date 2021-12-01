package recursive;

import java.util.Scanner;

public class OaKadarCarp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayý Girin: ");
		int sayi = scan.nextInt();

		// carp(sayi);
		System.out.println(carp(sayi));
	
	scan.close();
	}

	private static int carp(int sayi) {

		if (sayi <= 1)
			return 1;
		return sayi * carp(sayi - 1);

	}

}
