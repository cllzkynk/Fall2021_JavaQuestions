package bölüm03;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90) + 10;//10<=piyangosayýsý<100 elde ettik
		
		System.out.println("Lütfen 2 basamaklý tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		int tahmin = klavye.nextInt();
		int tahminBirlerBasamaðý = tahmin % 10;
		int tahminOnlarBasamaðý = tahmin / 10;
		int piyangoBirlerBasamaðý = piyango % 10;
		int piyangoOnlarBasamaðý = piyango / 10;
		
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
