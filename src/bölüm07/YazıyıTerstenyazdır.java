package bölüm07;

import java.util.Scanner;

public class YazıyıTerstenyazdır {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yazı giriniz: ");
		String yazı = klavye.nextLine();
		
		char[] yazıDizisi = yazı.toCharArray();
		
		char[] yazınınTersi = terseÇevir(yazıDizisi);
		System.out.println("Girdiğiniz yazının tersi");
		System.out.println( yazınınTersi);
				
	}

	public static char[] terseÇevir(char[] yazıDizisi) {
		char[] yazınınTersi = new char[yazıDizisi.length];
		for (int i = 0; i < yazınınTersi.length; i++) {
			yazınınTersi[i] = yazıDizisi[yazıDizisi.length - 1 - i];
		}
		return yazınınTersi;
	}

}
