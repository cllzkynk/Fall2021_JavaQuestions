package bölüm05;

import java.util.Scanner;

public class GirilenSayýlarýTopla {

	public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        
        System.out.println("Toplanacak sayýyý giriniz.Çýkýþ için sýfýr giriniz");
        int sayý = java.nextInt();
        
        int toplam = 0;
        while(sayý != 0) {
        	toplam += sayý;
        	System.out.println("Toplanacak sayýyý giriniz.Çýkýþ için sýfýr giriniz");
        	sayý = java.nextInt();
        }
        System.out.println("Toplam = " + toplam);
        java.close();
	}

}
