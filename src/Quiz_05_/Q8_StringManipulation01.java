package Quiz.Quiz_05;

import java.util.Scanner;

public class Q8_StringManipulation01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan bir cumle ve bir harf isteyin, 
		// harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("Lutfen bir harf giriniz...");
		String harf = scan.next().toLowerCase();
		
		System.out.println(cumle.contains(harf));
		
		
		
		
		
		scan.close();

	}

}
