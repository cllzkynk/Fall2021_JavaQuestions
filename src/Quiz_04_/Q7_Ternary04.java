package Quiz.Quiz_04;

import java.util.Scanner;

public class Q7_Ternary04 {

	public static void main(String[] args) {
		// Soru 4 Kullanicidan bir sayi alin Sayi pozitifse 
		// "Sayi pozitif" yazdirin, negatifse sayinin karesini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tam sayi Giriniz : ");
		int sayi=scan.nextInt();
	
		System.out.println(sayi>=0 ? "Pozitif sayi" : (sayi*sayi));
		
		
		
		// if ile de cozersek
		if (sayi>=0) {
			System.out.println("Pozitif sayi");
		}else if (sayi<0)
				System.out.println(sayi*sayi);
		scan.close();

	}
	

	}


