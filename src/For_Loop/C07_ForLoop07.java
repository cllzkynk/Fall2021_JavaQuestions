package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C07_ForLoop07 {

	public static void main(String[] args) {
		/*
		 * Soru 8 ) Interview Question 
		 * Kullanicidan bir String isteyin ve Stringi
		 * tersine ceviren bir program yazin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz ");

		String kelime = scan.nextLine();

		String terstenKelime = "";

		for (int i = 0; i < kelime.length(); i++) {

			terstenKelime += kelime.substring(kelime.length() - 1 - i, kelime.length() - i);

		}

		System.out.println(terstenKelime);

		scan.close();

	}

}