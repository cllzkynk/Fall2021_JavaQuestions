package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C01_NestedForLoop01 {

	public static void main(String[] args) {
		/*
		 * Soru 12 ) Kullanicidan pozitif bir rakam girmesini 
		 * isteyin ve girilen rakama
		 * gore asagidaki sekli cizdirin

		 *
		 * * 
		 * * * 
		 * * * *

		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen pozitif bir rakam giriniz : ");
		int rakam = scan.nextInt();

		for (int j = 1; j <= rakam; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print("* ");

			}
			System.out.println("");
		}
		scan.close();
	}

}