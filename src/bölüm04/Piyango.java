package bölüm04;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		String piyango = "" +(int)((Math.random() * 90) + 10);//String elde ettik
		
		System.out.println("Lütfen 2 basamaklý tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		String tahmin = klavye.next();
		
		char piyangoBirlerBasamaðý = piyango.charAt(1);
		char piyangoOnlarBasamaðý = piyango.charAt(0);
		
		char tahminBirlerBasamaðý = tahmin.charAt(1);
		char tahminOnlarBasamaðý = tahmin.charAt(0);
		
		System.out.println("Piyango numarasý : " + piyango);
		
		if (tahmin == piyango) {
			System.out.println("Tebriler 10000 tl kazandýnýz");
		} else if(tahminBirlerBasamaðý == piyangoOnlarBasamaðý
				&& tahminOnlarBasamaðý == piyangoBirlerBasamaðý ) {
			System.out.println("tebrikler 3000 tl kazandýnýz");
		} else if(tahminBirlerBasamaðý == piyangoBirlerBasamaðý
				|| tahminBirlerBasamaðý == piyangoOnlarBasamaðý
				|| tahminOnlarBasamaðý == piyangoBirlerBasamaðý
				|| tahminOnlarBasamaðý == piyangoOnlarBasamaðý) {
			System.out.println("tebrikler 1000 tl kazandýnýz");
		} else {
			System.out.println("malaesef kazamadýnýz :((");
		}
		
	}

}
