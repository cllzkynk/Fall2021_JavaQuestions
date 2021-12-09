package Quiz.Quiz_03;

import java.util.Scanner;

public class Q9_NestedİfElse01 {

	public static void main(String[] args) {
		/*
		 * Soru 11 Nested If kullanarak asagidaki soruyu cozen kodu yaziniz 
		 * Kullanicidan bir sifre girmesini isteyin 
		 * Eger ilk harf buyuk harf ise  olup olmadigini kontrol edin
		 * Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin
		 * Eger ilk harf kucuk harf ise " olup olmadigini kontrol edin
		 * Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen bir sifre giriniz : ");
		char ilkHarf=scan.next().toLowerCase().charAt(0);
		
		if (ilkHarf>='A' && ilkHarf<='Z') {
		     if (ilkHarf=='A') {
		     System.out.println("Gecerli sifre");
		     }else System.out.println("Gecersiz Sifre");
		}else if (ilkHarf>='a' && ilkHarf<='z') {
		     if (ilkHarf=='z') {
			 System.out.println("Gecerli sifre");
	         }else System.out.println("Gecersiz Sifre");
		}else System.out.println("Lutfen Gecerli sifre giriniz");

		
		scan.close();
	}
}
		


	

