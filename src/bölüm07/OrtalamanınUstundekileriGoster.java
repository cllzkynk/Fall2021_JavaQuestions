package b�l�m07;

import java.util.Scanner;

public class Ortalaman�nUstundekileriGoster {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalama al�nmas� i�in ka� say�y� girmek istiyorsunuz");
		
		int dong�Say�s� = scan.nextInt();
		double toplam = 0;
		double[] dizi = new double[dong�Say�s�];
		
		for (int i = 0; i < dong�Say�s�; i++) {
			System.out.println("L�tfen bir say� giriniz");
			dizi[i] = scan.nextDouble();
			toplam += dizi[i];
		}
		int ortalamadanB�y�klerSayac� = 0;
		double ortalama = (toplam / dong�Say�s�);
		for (int i = 0; i < dong�Say�s�; i++) {
			if(dizi[i] > ortalama) {
				ortalamadanB�y�klerSayac� ++;
			}
			
		}
		System.out.println(ortalama);
		System.out.println(ortalamadanB�y�klerSayac� + " tane say� ortalamadan b�y�kt�r");
	}

}
