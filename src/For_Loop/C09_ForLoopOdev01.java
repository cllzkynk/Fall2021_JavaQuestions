package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C09_ForLoopOdev01 {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question 
		// Kullanicidan bir String isteyin. Kullanicinin
		// girdigi String'in
		// palindrome (tersten) olup olmadigini kontrol eden bir program yazin.

		System.out.println("Lutfen bir isim giriniz");
		Scanner scan = new Scanner(System.in);
		String isim = scan.next();
		String terstenIsim = "";
		for (int i = 0; i < isim.length(); i++) {
			terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
		}
		if (isim.equals(terstenIsim)) { // equals bize true veya false dondurur...
			System.out.println("Girilen isim palindromdur");
		} else {
			System.out.println("Girilen isim palindrom degildir");
		}



		scan.close();
	}
}