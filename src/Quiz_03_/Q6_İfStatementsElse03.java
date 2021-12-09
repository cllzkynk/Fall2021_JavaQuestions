package Quiz.Quiz_03;

import java.util.Scanner;

public class Q6_İfStatementsElse03 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		 * eger uc kenar uzunlugu birbirine esit ise 
		 * ekrana "Eskenar ucgen" yazdirin.
		 * Diger durumlarda ekrana "Eskenar degil"

		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen uc kenar uzunlugu giriniz \nEnter'a basiniz : ");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		int kenar3=scan.nextInt();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Bu bir Eskenar ucgendir");
		}else 
			System.out.println("Eskenar ucgen degildir");
		
		scan.close();
	}

}
