package bolum02 ;

import java.util.Scanner;

public class SayiTahminTeksans {

	public static void main(String[] args) {
           int sayi = (int)(Math.random() * 101);
           
           Scanner java = new Scanner(System.in);
           System.out.println("0 il 100 aras�nda bir sayi girin");
           int tahmin = java.nextInt();
           
           System.out.println("Tuttu�umuz sayi :" + sayi);
           
           if(sayi == tahmin) {
        	   System.out.println("Bildiniz");
           } else if(sayi < tahmin) {
        	   System.out.println("B�y�k bir sayi girdiniz");
           } else {
        	   System.out.println("K���k bir sayi girdiniz");
           }
           java.close();
	}

}
