package Quiz.Quiz_04;

import java.util.Scanner;

public class Q9_Ternary06 {

	public static void main(String[] args) {
		// Soru 6 Kullanicidan bir harf isteyin 
		// kucuk harf ise consola "Kucuk Harf"
		// buyuk harfse consola "Buyuk Harf"
		// yoksa "girdiginiz karakter harf degil" yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir harf Giriniz : ");
		char harf=scan.next().charAt(0);
		
		System.out.println(harf>='a' && harf<='z' ? "Kucuk Harf" : harf>='A' && harf<='Z' ? "Buyuk Harf" : "Girdiginiz karakter harf degil");
		scan.close();
		
	}

}
