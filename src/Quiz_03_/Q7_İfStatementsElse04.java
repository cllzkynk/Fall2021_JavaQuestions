package Quiz.Quiz_03;

import java.util.Scanner;

public class Q7_İfStatementsElse04 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin. 
				// Notu harf sistemine cevirip yazdirin.
				// 50 den kucukse "D",
				// 50-60 arasi "C",
		        // 60-80 arasi "B",
				// 80 nin uzerinde ise "A"

		
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen notunuzu giriniz : ");
		double not=scan.nextDouble();
		
		if (not>0 || not>=100) {
			System.out.println("Gecerli bir not giriniz");
		}
		if (not>=0 || not<50) {
			System.out.println("Harf Notunuz : D");
		}else if (not<=60) {
			System.out.println("Harf Notunuz : C");
		}else if (not<=80) {
			System.out.println("Harf Notunuz : B");
		}else if (not>80 && not<=100) {
			System.out.println("Harf Notunuz : A");
			
			scan.close();
	}

}
}
