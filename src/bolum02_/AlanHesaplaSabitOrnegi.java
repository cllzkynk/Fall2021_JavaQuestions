package bolum02_;

import java.util.Scanner;

public class AlanHesaplaSabitOrnegi {
	public static void main(String[] args) {

		final double PI = 3.14159;
		Scanner girdi = new Scanner(System.in);

		double yaricap;
		double alan;


		// yar�cap� oku
		System.out.println("Alan� hesaplanacak �emberin yar��ap�n� giriniz ");
		yaricap = girdi.nextDouble();
		
		// alan� hesapla
		alan = yaricap * yaricap * PI;

		// alan� yazd�r
		System.out.println("yar�cap� " + yaricap + " olan �emberin alan�:" + alan + " d�r");

	}
}
