package b�l�m06;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		System.out.println("L�tfen bir hex ay� giriniz");
		String hex = java.nextLine();

		int dec = hex2Dec(hex.toUpperCase());

		System.out.println(hex + " hex say�s�n�n�n de�eri : " + dec + " dir");

	}

	public static int hex2Dec(String hex) {
		int dec = 0;
		int basamakDegeri = 1;
		for (int i = hex.length() - 1; 0 <= i; i--) {
			char hexChar = hex.charAt(i);
			int say�Degeri = hexCharToDec(hexChar);
			dec += say�Degeri * basamakDegeri;
			basamakDegeri = basamakDegeri * 16;
		}

		return dec;
	}

	public static int hexCharToDec(char ch) {
		if ('A' <= ch && ch <= 'F')
			return ch - 'A' + 10;
		else // ch is '0', '1', ..., or '9'
			return ch - '0';

	}

}
