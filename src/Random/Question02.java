package day01;

import java.util.Scanner;

public class Question02 {
	/*
	 * Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
	 * ekrana yazdiran java kodunu yaziniz.
	 * INPUT : Y
	 * 	OUTPUT : YES
	 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Y/N ikilisinden birini giriniz");
		char karakter = scan.next().charAt(0);
		
		if(karakter == 'Y' || karakter == 'y'){
			System.out.println("YES");
		}else if(karakter == 'N' || karakter == 'n'){
			System.out.println("NO");
		}else{
			System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
		}
		
		scan.close();
	}
}
