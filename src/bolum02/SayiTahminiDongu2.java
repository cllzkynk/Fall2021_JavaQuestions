package bolum02 ;

import java.util.Scanner;

public class SayiTahminiDongu2 {
	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);

		Scanner java = new Scanner(System.in);
		System.out.println("0 ile 100 aras�nda bir sayi girin");
		int tahmin = java.nextInt();

		while (true) {
			if(sayi == tahmin) {
				System.out.println("Bildiniz");
				System.exit(0);
			}else if (sayi < tahmin) {
				System.out.println("B�y�k bir sayi girdiniz.Tekrar deneyiniz");
				tahmin = java.nextInt();
			} else {
				System.out.println("K���k bir sayi girdiniz.Tekrar giriniz");
				tahmin = java.nextInt();
			}
			java.close();

		}
		
	}

}
