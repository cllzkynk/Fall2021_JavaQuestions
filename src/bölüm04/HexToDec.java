package b�l�m04;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		System.out.println("L�tfen bir hex say� giriniz");
		String girdi = java.next();
		
		if(girdi.length() != 1) {
			System.err.println("Tek karakter girilmeliydi");//erreo verecek girdi..k�rm�z� yazacak
			System.exit(0);//Program� bitirmi� olduk
		}
		
		char ch = girdi.toLowerCase().charAt(0);
		int say� = 0;//bu atama �art de�il
		
		if(ch >= 'a' && ch <= 'f') {
			say� = ch - 'a' + 10;
		} else if('0' <= ch && ch <= '9') {
			say� = ch - '0';
		} else {
			System.err.println("Hatal� giri�");
			System.exit(0);
		}
		
		System.out.println("hex " + ch + " nin de�eri : " + say�);
		java.close();

	}

}
