package bölüm03;

import java.util.Scanner;

public class HaftaSonumuHftaÝçimi {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen 1:pazartesi.....7:pazar olacak þekilde bir gün girin");
		int gün = klavye.nextInt();

		switch (gün) {// switch in içine nerden girdiyse breake kadar her basamaðý okur

		case 1:
		case 2:
			// System.out.println("case2");
		case 3:
			// System.out.println("case3");
		case 4:
			// System.out.println("case 5");
		case 5:
			System.out.println("Haftaiçi bir gün");
			break;
		case 6:
		case 7:
			System.out.println("Haftasonu bir gün");
			break;

		default:
			System.out.println("Yanlýþ girdi");
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
			System.out.println("Ne dediðini anlamýyorum");
			break;
		}
	}
}
