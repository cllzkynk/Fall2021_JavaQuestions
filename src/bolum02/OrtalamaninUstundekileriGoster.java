package bolum02 ;

import java.util.Scanner;

public class OrtalamaninUstundekileriGoster {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalama al�nmas� i�in ka� say�y� girmek istiyorsunuz");
		
		int donguSayisi = scan.nextInt();
		double toplam = 0;
		double[] dizi = new double[donguSayisi];
		
		for (int i = 0; i < donguSayisi; i++) {
			System.out.println("L�tfen bir say� giriniz");
			dizi[i] = scan.nextDouble();
			toplam += dizi[i];
		}
		int ortalamadanBuyuklerSayaci = 0;
		double ortalama = (toplam / donguSayisi);
		for (int i = 0; i < donguSayisi; i++) {
			if(dizi[i] > ortalama) {
				ortalamadanBuyuklerSayaci ++;
			}
			
		}
		System.out.println(ortalama);
		System.out.println(ortalamadanBuyuklerSayaci + " tane say� ortalamadan b�y�kt�r");
	}

}
