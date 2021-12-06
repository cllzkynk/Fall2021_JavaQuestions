package bölüm02;

import java.util.Scanner;

public class EkrandanSayýOkuma {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir sayýgiriniz: ");
		
		int sayý =klavye.nextInt();
		
		System.out.println("Girdiðiniz sayý: " + sayý);
		
	}

}
