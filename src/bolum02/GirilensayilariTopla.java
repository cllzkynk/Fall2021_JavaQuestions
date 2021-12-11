package bolum02 ;

import java.util.Scanner;

public class GirilensayilariTopla {

	public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        
        System.out.println("Toplanacak sayiy� giriniz.��k�� i�in s�f�r giriniz");
        int sayi = java.nextInt();
        
        int toplam = 0;
        while(sayi != 0) {
        	toplam += sayi;
        	System.out.println("Toplanacak sayiy� giriniz.��k�� i�in s�f�r giriniz");
        	sayi = java.nextInt();
        }
        System.out.println("Toplam = " + toplam);
        java.close();
	}

}
