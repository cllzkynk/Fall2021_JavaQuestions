package Quiz.Quiz_05;

import java.util.Scanner;

public class Q1_NestedTernary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Soru 1 
		int y=8;
		System.out.println((y > 5 ) ? y<10 ? 2*y : 3*y  : (y>10 ? 2+y : 3+y));

		//Soru 2 
		int k=12;
		System.out.println((k > 5 ) ? k<10 ? 2*k : 3*k  : (k>10 ? 2+k : 3+k));

		// Soru3 
		int z=5;
		System.out.println((z > 5 ) ? z<10 ? 2*z : 3*z  : (z>10 ? 2+z : 3+z));
		
		
		// Soru 4 Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen de�erlere gore dikdorgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen dikdortgen uzunluklarini giriniz : ");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1==kenar2 ? "Kare" : "Kare degil");
	
	
	   scan.close();

	}

}
