package Quiz.Quiz_03;

import java.util.Scanner;

public class Q3_İfStatements05 {

	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan bir gun alin eger gun "Cuma"
		 * ise ekrana "Muslumanlar icin kutsal gun" yazdirin.
		 * "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin.
		 * "Pazar" ise ekrana "Hiristiyanlar icin kutsal gun" yazdirin

		 */
		

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen bir gun giriniz : ");
		
		String day=scan.next().toLowerCase();
		
		if (day.equals("cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}else if (day.equals("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}else if (day.equals("pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}else
			System.out.println("Gecerli bir gun giriniz");
		
		scan.close();
			}
			
		
		
		
		
	

}
