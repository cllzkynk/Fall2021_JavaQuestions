package bölüm07;

import java.util.Scanner;

public class OrtalamanýnUstundekileriGoster {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalama alýnmasý için kaç sayýyý girmek istiyorsunuz");
		
		int dongüSayýsý = scan.nextInt();
		double toplam = 0;
		double[] dizi = new double[dongüSayýsý];
		
		for (int i = 0; i < dongüSayýsý; i++) {
			System.out.println("Lütfen bir sayý giriniz");
			dizi[i] = scan.nextDouble();
			toplam += dizi[i];
		}
		int ortalamadanBüyüklerSayacý = 0;
		double ortalama = (toplam / dongüSayýsý);
		for (int i = 0; i < dongüSayýsý; i++) {
			if(dizi[i] > ortalama) {
				ortalamadanBüyüklerSayacý ++;
			}
			
		}
		System.out.println(ortalama);
		System.out.println(ortalamadanBüyüklerSayacý + " tane sayý ortalamadan büyüktür");
	}

}
