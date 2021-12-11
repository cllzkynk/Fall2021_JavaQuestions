package bolum02 ;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		System.out.println("L�tfen bir hex sayi giriniz");
		String girdi = java.next();
		
		if(girdi.length() != 1) {
			System.err.println("Tek karakter girilmeliydi");//erreo verecek girdi..k�rm�z� yazacak
			System.exit(0);//Program� bitirmi� olduk
		}
		
		char ch = girdi.toLowerCase().charAt(0);
		int sayi = 0;//bu atama �art de�il
		
		if(ch >= 'a' && ch <= 'f') {
			sayi = ch - 'a' + 10;
		} else if('0' <= ch && ch <= '9') {
			sayi = ch - '0';
		} else {
			System.err.println("Hatal� giri�");
			System.exit(0);
		}
		
		System.out.println("hex " + ch + " nin de�eri : " + sayi);
		java.close();

	}

}
