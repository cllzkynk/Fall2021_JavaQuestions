package bolum02;

import java.util.Scanner;

public class VucutKitleindeksi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("L�tfen kg cinsinden kilonuzu giriniz :");
		double kilo = klavye.nextDouble();
		
		System.out.println("L�tfen metere cinsinden boyunuzu giriniz :");
		double boy = klavye.nextDouble();
		
		double vki = kilo / (boy * boy);
		System.out.println("vki =" + vki);
		
		if (vki < 18.5) {
			System.out.println("�ok zay�f ");
		}else if(vki < 25) {
			System.out.println("Normal");
		}else if(vki < 30) {
			System.out.println("kilolu");
		}else {
			System.out.println("Obez");
		}
	}

}
