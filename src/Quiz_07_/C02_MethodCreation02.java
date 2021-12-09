package Quiz.Quiz_07;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu,
		 * sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100 den buyukse birler,onlar
		 * ve yuzler basamagindaki rakamlarin toplamini, 100 den kucukse sadece 1 ler
		 * basamagini yazdiran 3 method olusturun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");

		int sayi = scan.nextInt();

		tekmiCiftmi(sayi);
		sifirlakarsilastir(sayi);
		istenenbasamaklar(sayi);

		scan.close();

	}

	public static void istenenbasamaklar(int sayi) {
		if (sayi > 100) {
			System.out.println("Birler basama��ndaki rakam : " + sayi % 10);
		} else { // sayi 1000 den buyukse secenegi icin 3 basamak
			int rakamlarToplami = 0;
			int rakam = 0;

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;

			rakam = sayi % 10;
			rakamlarToplami += rakam;

			System.out.println("sayinin birler,onlar ve yuzler basamagindaki rakamlar toplami : " + rakamlarToplami);

		}

	}

	public static void sifirlakarsilastir(int sayi) {
		if (sayi > 0) {
			System.out.println("Sifiridan buyuk bir sayi");
		} else if (sayi < 0) {
			System.out.println("Sifirdan kucuk bir sayi");
		} else
			System.out.println("Sifir sayisi pozitif veya negatif degildir");

	}

	public static void tekmiCiftmi(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("Bu sayi cift bir sayidir");
		} else
			System.out.println("Bu sayi tek bir sayidir");

	}

}
