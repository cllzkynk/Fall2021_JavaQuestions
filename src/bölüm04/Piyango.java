package b�l�m04;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		String piyango = "" +(int)((Math.random() * 90) + 10);//String elde ettik
		
		System.out.println("L�tfen 2 basamakl� tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		String tahmin = klavye.next();
		
		char piyangoBirlerBasama�� = piyango.charAt(1);
		char piyangoOnlarBasama�� = piyango.charAt(0);
		
		char tahminBirlerBasama�� = tahmin.charAt(1);
		char tahminOnlarBasama�� = tahmin.charAt(0);
		
		System.out.println("Piyango numaras� : " + piyango);
		
		if (tahmin == piyango) {
			System.out.println("Tebriler 10000 tl kazand�n�z");
		} else if(tahminBirlerBasama�� == piyangoOnlarBasama��
				&& tahminOnlarBasama�� == piyangoBirlerBasama�� ) {
			System.out.println("tebrikler 3000 tl kazand�n�z");
		} else if(tahminBirlerBasama�� == piyangoBirlerBasama��
				|| tahminBirlerBasama�� == piyangoOnlarBasama��
				|| tahminOnlarBasama�� == piyangoBirlerBasama��
				|| tahminOnlarBasama�� == piyangoOnlarBasama��) {
			System.out.println("tebrikler 1000 tl kazand�n�z");
		} else {
			System.out.println("malaesef kazamad�n�z :((");
		}
		
	}

}
