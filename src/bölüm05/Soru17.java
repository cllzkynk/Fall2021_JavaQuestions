package bölüm05;

import java.util.Scanner;

public class Soru17 {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		System.out.println("Üçgeniniz kaç satýr olsun");

	    int satirSayisi = java.nextInt();
		for (int i = 0; i < satirSayisi; i++) {
			for (int j = satirSayisi - 1 - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = i + 1; j > 0; j--) {
				System.out.print(" " + j);
			}
			for (int j = 2; j < i + 2; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		java.close();

	}

}
