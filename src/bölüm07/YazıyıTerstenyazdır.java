package b�l�m07;

import java.util.Scanner;

public class Yaz�y�Terstenyazd�r {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yaz� giriniz: ");
		String yaz� = klavye.nextLine();
		
		char[] yaz�Dizisi = yaz�.toCharArray();
		
		char[] yaz�n�nTersi = terse�evir(yaz�Dizisi);
		System.out.println("Girdi�iniz yaz�n�n tersi");
		System.out.println( yaz�n�nTersi);
				
	}

	public static char[] terse�evir(char[] yaz�Dizisi) {
		char[] yaz�n�nTersi = new char[yaz�Dizisi.length];
		for (int i = 0; i < yaz�n�nTersi.length; i++) {
			yaz�n�nTersi[i] = yaz�Dizisi[yaz�Dizisi.length - 1 - i];
		}
		return yaz�n�nTersi;
	}

}
