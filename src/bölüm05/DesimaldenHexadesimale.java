package b�l�m05;

import java.util.Scanner;

public class DesimaldenHexadesimale {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir tansay� giriniz");
		int tamsay� = java.nextInt();
		
		String hexSay� = "";
		
		int kalan = tamsay�;
		 while(kalan > 0) {
			 int basamak = kalan % 16;
			 if(basamak < 10) {
				 hexSay� = basamak + hexSay�;
			 }else {
				 hexSay� = (char)('A' + (basamak - 10)) + hexSay�;
			 }
			 kalan = kalan / 16;
		 }
		 System.out.println(tamsay� + " tamsay�s�n�n hex e cevrilmi� hali: " + hexSay� + " dir");
		 java.close();

	}

}
