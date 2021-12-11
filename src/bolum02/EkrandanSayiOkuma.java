package bolum02 ;

import java.util.Scanner;

public class EkrandanSayiOkuma {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir say�giriniz: ");
		
		int sayi =klavye.nextInt();
		
		System.out.println("Girdi�iniz say�: " + sayi);
		
	}

}
