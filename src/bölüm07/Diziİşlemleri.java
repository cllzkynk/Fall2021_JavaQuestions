package b�l�m07;

import java.util.Arrays;
import java.util.Scanner;

public class Dizi��lemleri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunlu�u = 2;
		int[] dizi = new int[dizininUzunlu�u];

		System.out.println("L�tfen " + dizi.length + " tane say� giriniz");
		{
			for (int i = 0; i < dizi.length; i++) {
				dizi[i] = scan.nextInt();
			}
		}
		System.out.println(Arrays.toString(dizi));
		System.out.println("�nce " + dizi[0]);
		dizi = new int[100];
		int toplamSay� = 0;
		System.out.println("sonra " + dizi[0]);
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
			toplamSay� += dizi[i];
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println("Dizinin de�erlerinin toplam� : " + toplamSay�);

		// Dizinin en b�y�k elaman�n� bulal�m
		// Dizinin en b�y�k eleman�n en k���k indexini bulal�m
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

		// Dizi rassal bir �ekilde kar��t�rl�yor
		for (int i = 0; i < dizi.length; i++) {
			int rassal�ndex = (int) (Math.random() * dizi.length);
			int ge�ici = dizi[i];
			dizi[i] = dizi[rassal�ndex];
			dizi[rassal�ndex] = ge�ici;
		}
		diziyiyazma(dizi);
		System.out.println();

		// Dizinin elemanlar�n� sola kayd�r
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
		
		diziyiyazma(dizi);
	}

	private static void diziyiyazma(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		// TODO Auto-generated method stub
		
	}
}
