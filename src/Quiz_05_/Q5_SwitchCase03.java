package Quiz.Quiz_05;

import java.util.Scanner;

public class Q5_SwitchCase03 {

	public static void main(String[] args) {
		/* Soru 3 Kullanicidan bir sayi girmesini isteyin
		Girilen sayi 
		10 ise "Iki basamakli en kucuk sayi"
		100 ise "uc basamakli en kucuk sayi"
		1000 ise "dort basamakli en kucuk sayi"
		Diger durumlarda "Girdigin sayiyi degistir" yazdirin
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		switch (sayi) {
		case 10:
			System.out.println("iki basamakli Sayi");
		    break;
		case 100:
			System.out.println("uc basamakli sayi");
			break ;
		case 1000:
			System.out.println("Dort basamakli sayi");
			break ;
		default :
			System.out.println("Girdigin sayiyi degistir");
		

			scan.close();		
	}

}
	}


