package b�l�m02;

import java.util.Scanner;

public class AlanHesaplaSabit�rne�i {
	public static void main(String[] args) {

		final double PI = 3.14159;
		Scanner girdi = new Scanner(System.in);

		double yar�cap;
		double alan;


		// yar�cap� oku
		System.out.println("Alan� hesaplanacak �emberin yar��ap�n� giriniz ");
		yar�cap = girdi.nextDouble();
		
		// alan� hesapla
		alan = yar�cap * yar�cap * PI;

		// alan� yazd�r
		System.out.println("yar�cap� " + yar�cap + " olan �emberin alan�:" + alan + " d�r");

	}
}
