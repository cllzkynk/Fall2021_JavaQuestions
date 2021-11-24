package arrays_Examples;

import java.util.Scanner;

public class Pdf_05 {

	public static void main(String[] args) {


		//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle = scan.nextLine();
		
		
		String arr1 [] = cumle.split(" ");
		
		
		System.out.println("Girilen cumledeki kelime sayisi: "+ arr1.length);
		
		
	scan.close();	
	}

}
