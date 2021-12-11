package bolum02 ;

import java.util.Scanner;

public class HaftaSonumuHftaicimi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("L�tfen 1:pazartesi.....7:pazar olacak �ekilde bir g�n girin");
		int gun = klavye.nextInt();

		switch (gun) {// switch in i�ine nerden girdiyse breake kadar her basama�� okur

		case 1:
		case 2:
			// System.out.println("case2");
		case 3:
			// System.out.println("case3");
		case 4:
			// System.out.println("case 5");
		case 5:
			System.out.println("Haftai�i bir g�n");
			break;
		case 6:
		case 7:
			System.out.println("Haftasonu bir g�n");
			break;

		default:
			System.out.println("Yanl�� girdi");
			break;
		}
		System.out.println("Devam etmek istiyor musun ?");
		String cevap = klavye.next();

		switch (cevap.charAt(0)) {// girdinin ilk harfine bakar
		case 'e':
		case 'E':
			System.out.println("Devam edebilirsin");
			break;
		case 'h':
		case 'H':
			System.out.println("Sen bilirsin");
			break;
		default:
			System.out.println("Ne dedi�ini anlam�yorum");
			break;
		}
	}
}
