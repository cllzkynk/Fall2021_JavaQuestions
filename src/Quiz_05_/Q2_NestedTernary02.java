package Quiz.Quiz_05;

import java.util.Scanner;

public class Q2_NestedTernary02 {

	public static void main(String[] args) {
		// Soru 4 Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen dikdortgen uzunluklarini giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1==kenar2 ? "Kare" : "Kare degil");
	
	
	   scan.close();
	
	}

}
