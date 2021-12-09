package Quiz.Quiz_06;

import java.util.Scanner;

public class Q1_StringManipulation03 {

	public static void main(String[] args) {
		// Soru 1 Kullanicidan bir cumle ve bir harf isteyin, 
		// harfin cumlede var olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime girin");
		String kelime=scan.next().toLowerCase();
		
		
		//  cumlede kelimenin kullanilip kullanilmadigini yazdirin
		//  indexOf() kullanalim
		
		if (cumle.indexOf(kelime)!=-1) {
			System.out.println("Kelime cumlede kullanilmis");
		} else {
			System.out.println("kelime cumlede kullanilmamis");
		}
		
		// contains() kullanalim
		
		if (cumle.contains(kelime)) {
			System.out.println("Kelime cumlede kullanilmis");
		}else {
			System.out.println("kelime cumlede kullanilmamis");
			
			scan.close();
		}
	}
}
		