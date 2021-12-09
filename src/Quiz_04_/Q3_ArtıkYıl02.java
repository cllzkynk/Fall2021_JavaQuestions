package Quiz.Quiz_04;

import java.util.Scanner;

public class Q3_ArtıkYıl02 {

	public static void main(String[] args) {
		/*
		 * Soru 10 Interview Question 
/*
		 Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4 un kati olmasina ragmen 100 ile 	bolunebilen yillardan
		         sadece 400 un kati olan yillar artik yildir
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen artik yil kontrolu icin bir yil giriniz");

		int yil = scan.nextInt();

		if (yil % 4 != 0) { // 4 un kati olmayanlar
			System.out.println("Girdiginiz yil artik yil degil");
		} else { // 4 un kati olanlar

			if (yil % 100 == 0 && yil % 400 == 0) {
				System.out.println("Girdiginiz yil artik yil");
			} else if (yil % 100 == 0 && yil % 400 != 0) {
				System.out.println("Girdiginiz yil artik yil degil");
			} else {
				System.out.println("Girdiginiz yil artik yil");
			}
		}
		scan.close();
	}

}
