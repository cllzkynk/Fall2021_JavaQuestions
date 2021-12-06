package bölüm02;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		Scanner ahmet = new Scanner(System.in);
		
		System.out.println("Ortlama hesaplamak için 3 sayý giriniz");
		
		double sayý1 = ahmet.nextDouble();
		double sayý2 = ahmet.nextDouble();
		double sayý3 = ahmet.nextDouble();
		
		double ortalama =(sayý1 + sayý2 + sayý3)/3;
		 System.out.println("Girilen 3 sayýnýn ortalamasý " + ortalama);
		
	}
}
