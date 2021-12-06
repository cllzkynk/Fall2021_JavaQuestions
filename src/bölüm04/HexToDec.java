package bölüm04;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		System.out.println("Lütfen bir hex sayý giriniz");
		String girdi = java.next();
		
		if(girdi.length() != 1) {
			System.err.println("Tek karakter girilmeliydi");//erreo verecek girdi..kýrmýzý yazacak
			System.exit(0);//Programý bitirmiþ olduk
		}
		
		char ch = girdi.toLowerCase().charAt(0);
		int sayý = 0;//bu atama þart deðil
		
		if(ch >= 'a' && ch <= 'f') {
			sayý = ch - 'a' + 10;
		} else if('0' <= ch && ch <= '9') {
			sayý = ch - '0';
		} else {
			System.err.println("Hatalý giriþ");
			System.exit(0);
		}
		
		System.out.println("hex " + ch + " nin deðeri : " + sayý);
		java.close();

	}

}
