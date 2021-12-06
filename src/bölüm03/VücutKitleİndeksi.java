package bölüm03;

import java.util.Scanner;

public class VücutKitleÝndeksi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen kg cinsinden kilonuzu giriniz :");
		double kilo = klavye.nextDouble();
		
		System.out.println("Lütfen metere cinsinden boyunuzu giriniz :");
		double boy = klavye.nextDouble();
		
		double vki = kilo / (boy * boy);
		System.out.println("vki =" + vki);
		
		if (vki < 18.5) {
			System.out.println("Çok zayýf ");
		}else if(vki < 25) {
			System.out.println("Normal");
		}else if(vki < 30) {
			System.out.println("kilolu");
		}else {
			System.out.println("Obez");
		}
	}

}
