package b�l�m03;

import java.util.Scanner;

public class TestMant�ksalOperat�rler {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("L�tfen bir atm say� giriniz :");

		int say� = klavye.nextInt();

		if (say� % 2 == 0 && say� % 3 == 0) {
			System.out.println("Girdi�iniz say� 2 ve 3 e tam b�l�nebiliyor");
		}
		
		if (say� % 2 == 0 || say� % 3 == 0) {
			System.out.println("Girdi�iniz say� 2 veya 3 e b�l�n�yor");
		}
		
		if (say� % 2 == 0 ^ say� % 3 == 0) {
			System.out.println("Girdi�iniz say� 2 veya 3 e b�l�n�yor ancak her ikisine birden b�l�nemiyor");
			
		}
	}

}
