package day01;

import java.util.Scanner;

public class Question06 {
	/*
	 Kullanicidan kilosunu ve boyunu alip
Vucut kitle indeksini hesaplayan bir program yaziniz.
Ipucu : Vucut 
Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
ORNEK:
INPUT      : Kilo: 71
                  Boy: 1,72
OUTPUT  : Vucut Kitle Indeksiniz : 23
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen once kilonuzu kg cinsinden giriniz ve sonrasinda boyunuzu cm cinsinden giriniz");
		double kilo = scan.nextDouble();
		double boy = scan.nextDouble();
		boy = boy/100; // boy/=100
		double vki = kilo/(boy*boy);
		System.out.println(Math.round(vki));
		
	}

}