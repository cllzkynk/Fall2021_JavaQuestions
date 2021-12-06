package bölüm03;

import java.util.Scanner;

public class TestMantýksalOperatörler {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen bir atm sayý giriniz :");

		int sayý = klavye.nextInt();

		if (sayý % 2 == 0 && sayý % 3 == 0) {
			System.out.println("Girdiðiniz sayý 2 ve 3 e tam bölünebiliyor");
		}
		
		if (sayý % 2 == 0 || sayý % 3 == 0) {
			System.out.println("Girdiðiniz sayý 2 veya 3 e bölünüyor");
		}
		
		if (sayý % 2 == 0 ^ sayý % 3 == 0) {
			System.out.println("Girdiðiniz sayý 2 veya 3 e bölünüyor ancak her ikisine birden bölünemiyor");
			
		}
	}

}
