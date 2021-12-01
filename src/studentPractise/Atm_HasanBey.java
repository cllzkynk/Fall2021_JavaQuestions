package studentPractise;

import java.util.Scanner;

public class Atm_HasanBey {
	/*
	 * ATM Kullaniciya giriþ için kart numarasi ve þifresini isteyin, eger herhangi
	 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda boþluk ile
	 * girerse de eger doðruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
	 * kullanicinin yapabileceði iþlemleri ekrana yazdirin, Bakiye sorgula, para
	 * yatirma, para çekme, para gönderme, sifre deðiþtirme ve cikis. Para çekme ve
	 * para gonderme iþleminde mevcut bakiyeden buyuk para çekilemez, Para gönderme
	 * iþleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger
	 * deðilse menü ekranina geri donsun. Sifre deðiþtirme iþleminde mevcut þifreyi
	 * teyit ettikten sonra, sifre deðiþiklik iþlemini yapmali,
	 */

	static String kartNumaram = "123456";
	static String sifrem = "1234";
	static double bakiye;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("JAVA BANKA HOSGELDINIZ");

		String kart = "";
		String sifre = "";

		do {
			System.out.println("Kart numaranizi giriniz");
			kart = scan.nextLine();
			System.out.println("Sifrenizi giriniz");
			sifre = scan.nextLine();
			if (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram)) {
				System.out.println("Hatali giris yaptiniz");
			}

		} while (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNumaram));

		ekran();

		scan.close();
	}// main sonu

	public static void ekran() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sifreniz dogrulandi");
		char secim = ' ';
		do {
			System.out.println(
					"Lutfen yapmak istediginiz islemi seciniz\nA-->Bakiye Sorgulama\nB-->Para Cekme\nC-->Para Yatirma\nD-->Para Gonderme\nE-->Sifre Degistirme\nF-->Cikis");
			secim = scan.next().toUpperCase().charAt(0);
			switch (secim) {
			case 'A':
				bakiyeSorgulama();
				break;
			case 'B':
				paraCekme();
				break;
			case 'C':
				paraYatirma();
				break;
			case 'D':
				paraGonderme();
				break;
			case 'E':
				sifreDegistirme();
				break;
			case 'F':
				System.out.println("Cikis basarili");
				break;

			default:
				break;
			}
		} while (secim != 'F');

		scan.close();
	}

	private static void sifreDegistirme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mevcut sifrenizi giriniz");
		if (sifrem.equals(scan.next())) {
			System.out.println("Yeni sifrenizi giriniz");
			sifrem = scan.next();
		} else {
			System.out.println("Mevcut sifrenizi yanlis girdiniz.");
		}
		scan.close();
	}

	private static void paraGonderme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para gondermek istedginiz hesabin IBAN`ini giriniz");
		String Iban = scan.nextLine().toUpperCase();
		if (Iban.startsWith("TR") && Iban.replaceAll("\\s", "").length() == 26) {
			System.out.println("Gonderilecek turari giriniz");
			double gonderilecekTutar = scan.nextDouble();
			if (gonderilecekTutar >= bakiye) {
				System.out.println("Gonderim basarili");
				bakiye -= gonderilecekTutar;
				System.out.println("Mevcut bakiyeniz : " + bakiye);
			} else {
				System.out.println("Bakiyeniz yetersiz");
			}
		} else {
			System.out.println("IBAN i kontrol ediniz.");
		}

		scan.close();
	}

	private static void paraYatirma() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yatirmak istediginiz tutari giriniz");
		double yatirilanTutar = scan.nextDouble();
		bakiye += yatirilanTutar;
		System.out.println("Islem basarili.Paraniz hesaba eklendi\nMevcut bakiyeniz :" + bakiye);
	scan.close();}

	private static void paraCekme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("CEkmek istediginiz tutari giriniz");
		double cekilenTutar = scan.nextDouble();
		if (cekilenTutar <= bakiye) {
			bakiye -= cekilenTutar;
			System.out.println("Islem basarili Kalan bakiye :" + bakiye + " Tl");
		} else {
			System.out.println("Bakiye yetersiz");
		}

		scan.close();
	}

	private static void bakiyeSorgulama() {
		System.out.println("Bakiyeniz -->" + bakiye + " Tl");

	}

} // class sonu
