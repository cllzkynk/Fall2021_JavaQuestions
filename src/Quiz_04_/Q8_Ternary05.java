package Quiz.Quiz_04;

import java.util.Scanner;

public class Q8_Ternary05 {

	public static void main(String[] args) {
		// Soru 1 Kullanicidan bir tamsayi alin ve 
		// sayi 10 dan kucukse rakam
		// 100 den kucukse "iki basamakli sayi"
		// degilse "uc basamakli veya daha buyuk sayi" yazdirin


		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir tam sayi Giriniz : ");
		int sayi=scan.nextInt();
		
		System.out.println(sayi<10 ? "Rakam" : sayi<100 ? "iki basamakli sayi" : "uc basamakli veya daha buyuk sayi");
		
		scan.close();
	}

}
