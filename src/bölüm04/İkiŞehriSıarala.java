package bölüm04;

import java.util.Scanner;

public class ÝkiÞehriSýarala {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir þehir giriniz");
		String sehir1 = klavye.next();
		
		System.out.println("Bir þehir daha giriniz");
		String sehir2 = klavye.next();
		
		if(sehir1.compareTo(sehir2) < 0) {//Sehir1 integer olarak þehir2 den küçükse, demek bu..
			System.out.println("Þehirleri sýralý þekilde yazdýrýyoruz :" + sehir1 + " " + sehir2);
		} else {
			System.out.println("Þehirleri sýralý þekilde yazdýrýyoruz :" + sehir2 + " " + sehir1);
		}
	}

}
