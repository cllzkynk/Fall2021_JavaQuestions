package bölüm05;

import java.util.Scanner;

public class SayıTahminTekŞans {

	public static void main(String[] args) {
           int sayı = (int)(Math.random() * 101);
           
           Scanner java = new Scanner(System.in);
           System.out.println("0 il 100 arasında bir sayı girin");
           int tahmin = java.nextInt();
           
           System.out.println("Tuttuğumuz sayı :" + sayı);
           
           if(sayı == tahmin) {
        	   System.out.println("Bildiniz");
           } else if(sayı < tahmin) {
        	   System.out.println("Büyük bir sayı girdiniz");
           } else {
        	   System.out.println("Küçük bir sayı girdiniz");
           }
           java.close();
	}

}
