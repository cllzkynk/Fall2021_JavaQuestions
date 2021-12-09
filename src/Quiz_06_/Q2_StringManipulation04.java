package Quiz.Quiz_06;

import java.util.Scanner;

public class Q2_StringManipulation04 {

	public static void main(String[] args) {
		/*
		 * Soru 1 Kullanicidan email adresini girmesini isteyin, mail @gmail.com
		 * iceriyorsa "Email adresiniz kaydedildi", icermiyorsa "Lutfen gmail mail
		 * adresinizi giriniz yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email adresi giriniz");

		String mail = scan.nextLine();

		if (mail.contains("@gmail.com")) {
			System.out.println("Email adresiniz kaydedildi");
		} else
			System.out.println("Lutfen gmail adresinizi giriniz");

		scan.close();

	}

}
