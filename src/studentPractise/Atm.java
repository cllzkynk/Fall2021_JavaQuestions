package studentPractise;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int bakiye = 10000;
		System.out.println("1-Bakiye sorgulama");
		System.out.println("2-Para çekme");
		System.out.println("3-Para yatırma");
		while (true) {
			System.out.println("Lütfen işleminizi giriniz");
			int islem = s.nextInt();
			switch (islem) {
			case 1:
				System.out.println("Bakiyeniz " + bakiye + " ₺'dir");
				break;
			case 2:
				System.out.println("Miktar giriniz");
				int miktar = s.nextInt();
				bakiye -= miktar;
				System.out.println("Yeni bakiye " + bakiye + "₺");
				break;
			case 3:
				System.out.println("Miktar giriniz");
				int miktar1 = s.nextInt();
				bakiye += miktar1;
				System.out.println("Yeni bakiye " + bakiye + "₺");
				break;
			default:
				System.out.println("Geçersiz işlem girdiniz");
				break;
			}
			System.out.println("Yeni bir işlem yapmak istiyor musunuz? e/h");
			String yeniden = s.next();
			if (yeniden.equals("e"))
				continue;
			if (yeniden.equals("h"))
				System.out.println("Çıkılıyor...");
			break;
		}
	s.close();}
}