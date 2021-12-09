package Quiz.Quiz_04;

import java.util.Scanner;

public class Q5_Ternary02 {

	public static void main(String[] args) {
		/*
		 * Soru 1 Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin...
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen iki sayi Giriniz : ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1>sayi2 ? sayi2:sayi1);
		
		// Soru 2 Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi Giriniz : ");
		int sayi3=scan.nextInt();
		System.out.println(sayi3%2==0 ? "Cift sayi" : "Tek sayi");
		
		
		
	scan.close();
	sc.close();
	
	}

}
