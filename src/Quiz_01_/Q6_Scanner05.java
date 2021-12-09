package Quiz.Quiz_01;

import java.util.Scanner;

public class Q6_Scanner05 {

	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		 * Isminiz : Mehmet Soyisminiz : Memo 
		 * Kursumuza katiliminiz alinmistir,tesekkur
		 * ederiz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTER'a basiniz");
		
		String name=scan.next();
		String surname=scan.next();
		
		System.out.println("Isminiz : " + name + "\nSoyisminiz : " + surname + "\nKatiliminiz alinmistir ");
		
		scan.close();
		

	}

}
