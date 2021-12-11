package bolum02;

import java.util.Scanner;

public class DesimaldenHexadesimale {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir tansay� giriniz");
		int tamsayi = java.nextInt();
		
		String hexSayi = "";
		
		int kalan = tamsayi;
		 while(kalan > 0) {
			 int basamak = kalan % 16;
			 if(basamak < 10) {
				 hexSayi = basamak + hexSayi;
			 }else {
				 hexSayi = (char)('A' + (basamak - 10)) + hexSayi;
			 }
			 kalan = kalan / 16;
		 }
		 System.out.println(tamsayi + " tamsay�s�n�n hex e cevrilmi� hali: " + hexSayi + " dir");
		 java.close();

	}

}
