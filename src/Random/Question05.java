package day01;

import java.util.Scanner;

public class Question05 {
	/* Soru 5:
	 * Kullanicinin girmis oldugu  1 ile 12 arasindaki sayinin yilin hangi ayi oldugunu 
	 * yazdiran Switch Case java kodunu yaziniz.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 12 arasinda bir sayi giriniz");
		byte ay = scan.nextByte();
		
		switch(ay){
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("Subat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayis");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("Agustos");
			break;
		case 9:
			System.out.println("Eylul");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kasim");
			break;
		case 12:
			System.out.println("Aralik");
			break;
			default:
				System.out.println("Lutfen gecerli bir ay giriniz");
		}

	}

}