package bolum02 ;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		Scanner ahmet = new Scanner(System.in);
		
		System.out.println("Ortlama hesaplamak i�in 3 sayi giriniz");
		
		double sayi1 = ahmet.nextDouble();
		double sayi2 = ahmet.nextDouble();
		double sayi3 = ahmet.nextDouble();
		
		double ortalama =(sayi1 + sayi2 + sayi3)/3;
		 System.out.println("Girilen 3 sayin�n ortalamas� " + ortalama);
		
	}
}
