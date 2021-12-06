package bölüm05;

import java.util.Scanner;

public class DesimaldenHexadesimale {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir tansayý giriniz");
		int tamsayý = java.nextInt();
		
		String hexSayý = "";
		
		int kalan = tamsayý;
		 while(kalan > 0) {
			 int basamak = kalan % 16;
			 if(basamak < 10) {
				 hexSayý = basamak + hexSayý;
			 }else {
				 hexSayý = (char)('A' + (basamak - 10)) + hexSayý;
			 }
			 kalan = kalan / 16;
		 }
		 System.out.println(tamsayý + " tamsayýsýnýn hex e cevrilmiþ hali: " + hexSayý + " dir");
		 java.close();

	}

}
