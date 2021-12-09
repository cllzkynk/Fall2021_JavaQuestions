package Quiz.Quiz_04;

import java.util.Scanner;

public class Q6_Ternary03 {

	public static void main(String[] args) {
		
		// Soru 3 Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi Giriniz : ");
		int sayi=scan.nextInt();
		System.out.println(sayi>0 ? (sayi*1) : (sayi*-1));
	
	scan.close();
	
	}

}
