package Quiz.Quiz_06;

import java.util.Scanner;

public class Q3_StringManipulation05 {

	public static void main(String[] args) {
		/*
		 * Soru 2 Kullanicidan bir cumle isteyin 
		 * Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak yazdirinn
		 * "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		 * iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor" yazdirin
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");

		String cumle = scan.nextLine().toLowerCase();
		
		if (cumle.contains("Buyuk")) {
			System.out.println(cumle.toUpperCase());
		}else if (cumle.contains("Kucuk")){
			System.out.println(cumle.toLowerCase()); 
		}else {
			System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
		
		scan.close();
	}

}
}
