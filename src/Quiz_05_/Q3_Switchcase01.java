package Quiz.Quiz_05;

import java.util.Scanner;

public class Q3_Switchcase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu
		// oldugunu sorun ve gun ismini yazdirin



		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz");
		int gunNo=scan.nextInt();

		switch(gunNo) {
			case 1:
				System.out.println("Bugun Pazartesi");
				break;
			case 2:
				System.out.println("Bugun sali");
				break;
			case 3:
				System.out.println("Bugun Carsamba");
				break;
			case 4:
				System.out.println("Bugun Persembe");
				break;
			case 5:
				System.out.println("Bugun Cuma");
				break;
			case 6:
				System.out.println("Bugun Cumartesi");
				break;
			case 7:
				System.out.println("Bugun Pazar");
				break;
			default:
				System.out.println("Lutfen gecerli gun numarasi giriniz");

				scan.close();
		}


	}

}