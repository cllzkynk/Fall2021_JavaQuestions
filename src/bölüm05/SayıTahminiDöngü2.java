package b�l�m05;

import java.util.Scanner;

public class Say�TahminiD�ng�2 {
	public static void main(String[] args) {
		int say� = (int) (Math.random() * 101);

		Scanner java = new Scanner(System.in);
		System.out.println("0 ile 100 aras�nda bir say� girin");
		int tahmin = java.nextInt();

		while (true) {
			if(say� == tahmin) {
				System.out.println("Bildiniz");
				System.exit(0);
			}else if (say� < tahmin) {
				System.out.println("B�y�k bir say� girdiniz.Tekrar deneyiniz");
				tahmin = java.nextInt();
			} else {
				System.out.println("K���k bir say� girdiniz.Tekrar giriniz");
				tahmin = java.nextInt();
			}
			java.close();

		}
		
	}

}
