package bölüm05;

import java.util.Scanner;

public class ÇokluÇýkarmaArasýnavý {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		long baþlangýçZamaný = System.currentTimeMillis();
		String rapor = "";
		int sayaç = 0;
		int doðruSayacý = 0;
		while (sayaç < 5) {

			int sayý1 = (int) (Math.random() * 10);
			int sayý2 = (int) (Math.random() * 10);

			int geçiciSayý = 0;
			if (sayý1 < sayý2) {
				sayý1 = geçiciSayý;
				sayý1 = sayý2;
				sayý2 = geçiciSayý;
			}
			System.out.println(sayý1 + " - " + sayý2 + " =?");
			int cevap = java.nextInt();

			if (sayý1 - sayý2 == cevap) {
				System.out.println("bildiniz");
				doðruSayacý++;
				rapor += sayý1 + " - " + sayý2 + " = " + cevap + " doðru\n";
						
			} else {
				System.out.println("Bilemediniz");
				rapor += sayý1 + " - " + sayý2 + " = " + cevap + " yanlýþ\n";
			}
			sayaç ++;
		}
		long bitiþZamaný = System.currentTimeMillis();
		
		System.out.println("toplam süre : " + (bitiþZamaný - baþlangýçZamaný) / 1000 + " saniyedir");
		System.out.println(sayaç + " tane soru soruldu");
		System.out.println(doðruSayacý + " tane doðru cevap verdiniz");
		System.out.println(rapor);
		java.close();

	}

}
