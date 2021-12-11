package bolum02 ;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		String piyango = "" +(int)((Math.random() * 90) + 10);//String elde ettik
		
		System.out.println("L�tfen 2 basamakl� tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		String tahmin = klavye.next();
		
		char piyangoBirlerBasamagi = piyango.charAt(1);
		char piyangoOnlarBasamagi = piyango.charAt(0);
		
		char tahminBirlerBasamagi = tahmin.charAt(1);
		char tahminOnlarBasamagi = tahmin.charAt(0);
		
		System.out.println("Piyango numaras� : " + piyango);
		
		if (tahmin == piyango) {
			System.out.println("Tebriler 10000 tl kazand�n�z");
		} else if(tahminBirlerBasamagi == piyangoOnlarBasamagi
				&& tahminOnlarBasamagi == piyangoBirlerBasamagi ) {
			System.out.println("tebrikler 3000 tl kazand�n�z");
		} else if(tahminBirlerBasamagi == piyangoBirlerBasamagi
				|| tahminBirlerBasamagi == piyangoOnlarBasamagi
				|| tahminOnlarBasamagi == piyangoBirlerBasamagi
				|| tahminOnlarBasamagi == piyangoOnlarBasamagi) {
			System.out.println("tebrikler 1000 tl kazand�n�z");
		} else {
			System.out.println("malaesef kazamad�n�z :((");
		}
		
	}

}
