package bolum02;

import java.util.Scanner;

public class CokluuCkarmaArasinavi {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		long baslangicZamani = System.currentTimeMillis();
		String rapor = "";
		int sayac = 0;
		int dogruSayaci = 0;
		while (sayac < 5) {

			int sayi1 = (int) (Math.random() * 10);
			int sayi2 = (int) (Math.random() * 10);

			int gecicisayi = 0;
			if (sayi1 < sayi2) {
				sayi1 = gecicisayi;
				sayi1 = sayi2;
				sayi2 = gecicisayi;
			}
			System.out.println(sayi1 + " - " + sayi2 + " =?");
			int cevap = java.nextInt();

			if (sayi1 - sayi2 == cevap) {
				System.out.println("bildiniz");
				dogruSayaci++;
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " do�ru\n";
						
			} else {
				System.out.println("Bilemediniz");
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " yanl��\n";
			}
			sayac ++;
		}
		long bitisZamani = System.currentTimeMillis();
		
		System.out.println("toplam s�re : " + (bitisZamani - baslangicZamani) / 1000 + " saniyedir");
		System.out.println(sayac + " tane soru soruldu");
		System.out.println(dogruSayaci + " tane do�ru cevap verdiniz");
		System.out.println(rapor);
		java.close();

	}

}
