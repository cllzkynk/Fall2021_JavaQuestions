package b�l�m03;

import java.util.Scanner;

public class DersNotuBulanProgram {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Ders puan�n�z� giriniz : (0 ile 100 aras�nda)");
		
		int dersPuan = klavye.nextInt();
		
		if (dersPuan >= 90) {
			System.out.println("Ders notunuz A");
		} else if (dersPuan >= 80) {
			System.out.println("Ders notunuz B");
		} else if (dersPuan >= 70) {
			System.out.println("Ders notunuz C");
		} else if (dersPuan >= 60) {
			System.out.println("Ders notunuz D");
		} else {
			System.out.println("Ders notunuz E");
		}
		
		
	}

}
