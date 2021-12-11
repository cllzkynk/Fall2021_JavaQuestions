package bolum02 ;

import java.util.Scanner;

public class YaziyiTerstenyazdir {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yazi giriniz: ");
		String yazi = klavye.nextLine();
		
		char[] yaziDizisi = yazi.toCharArray();
		
		char[] yazininTersi = tersecevir(yaziDizisi);
		System.out.println("Girdi�iniz yazinin tersi");
		System.out.println( yazininTersi);
				
	}

	public static char[] tersecevir(char[] yaziDizisi) {
		char[] yazininTersi = new char[yaziDizisi.length];
		for (int i = 0; i < yazininTersi.length; i++) {
			yazininTersi[i] = yaziDizisi[yaziDizisi.length - 1 - i];
		}
		return yazininTersi;
	}

}
