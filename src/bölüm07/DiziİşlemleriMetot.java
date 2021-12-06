package b�l�m07;
import java.util.Arrays;
import java.util.Scanner;

public class Dizi��lemleriMetot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunlu�u = 10;
		int[] dizi = new int[dizininUzunlu�u];

			
		
		diziyiRassalSay�larlaDoldur(dizi);
		
		//diziyiYazd�r(dizi);	
		System.out.println(Arrays.toString(dizi));
		System.out.println();
		
		dizininToplam�n�Bul(dizi);

		dizininEnB�y�kEleman�n�Ve�ndeksiniBul(dizi);

		diziyiKar��t�r(dizi);
		System.out.println();
		
		diziyiYazd�r(dizi);
		
		diziyiSolakayd�r(dizi);
		System.out.println();
		
		diziyiYazd�r(dizi);
	
		
	}

	public static void diziyiSolakayd�r(int[] dizi) {
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
	}

	public static void diziyiKar��t�r(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int rassal�ndex = (int) (Math.random() * dizi.length);
			int ge�ici = dizi[i];
			dizi[i] = dizi[rassal�ndex];
			dizi[rassal�ndex] = ge�ici;
		}
	}

	public static void dizininEnB�y�kEleman�n�Ve�ndeksiniBul(int[] dizi) {
		int enB�y�kEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enB�y�kEleman < dizi[i]) {
				enB�y�kEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en b�y�k eleman� : " + enB�y�kEleman);
		System.out.println("Dizinin en b�y�k eleman�n indexi : " + index);
	}

	public static void dizininToplam�n�Bul(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println("Dizideki elemanlar�n toplam� : " + toplam);
	}

	public static void diziyiYazd�r(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	private static void diziyiRassalSay�larlaDoldur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}

}
