package Quiz.Quiz_04;

import java.util.Scanner;

class Q1_NestedIfElse02 {

	public static void main(String[] args) {
		/*
		 * Soru 12 
		 * Kullanicidan 4 basamakli bir sayi girmesini isteyin Girdigi sayi 5 e
		 * bolunuyorsa son rakamini kontrol edin Son rakam 0 ise ekrana "5 e bolunen
		 * cift sayi" yazdirin Son rakam 0 degil ise "5 e bolunen
		 * teksayi" yazdirin
		 * Girdigi password 5 e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("litfen 4 basamakli bir sayi giriniz : ");
		int sayi = scan.nextInt();
		if (sayi % 5 == 0) {
			if (sayi % 2 == 0) {
				System.out.println("Girdiginiz sayi 5'e bolunen cift  sayidir");
			} else
				System.out.println("Girdiginiz sayi 5'e bolunen  tek sayidir");

		} else
			System.out.println("tekrar deneyiniz!!!");
	



	scan.close();

}

}
