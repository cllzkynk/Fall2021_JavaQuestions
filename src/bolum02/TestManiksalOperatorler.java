package bolum02 ;

import java.util.Scanner;

public class TestManiksalOperatorler {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("L�tfen bir atm sayi giriniz :");

		int sayi = klavye.nextInt();

		if (sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println("Girdi�iniz sayi 2 ve 3 e tam b�l�nebiliyor");
		}
		
		if (sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println("Girdi�iniz sayi 2 veya 3 e b�l�n�yor");
		}
		
		if (sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println("Girdi�iniz sayi 2 veya 3 e b�l�n�yor ancak her ikisine birden b�l�nemiyor");
			
		}
	}

}
