package b�l�m03;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90) + 10;//10<=piyangosay�s�<100 elde ettik
		
		System.out.println("L�tfen 2 basamakl� tahmininizi giriniz");
		
		Scanner klavye = new Scanner(System.in);
		int tahmin = klavye.nextInt();
		int tahminBirlerBasama�� = tahmin % 10;
		int tahminOnlarBasama�� = tahmin / 10;
		int piyangoBirlerBasama�� = piyango % 10;
		int piyangoOnlarBasama�� = piyango / 10;
		
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
