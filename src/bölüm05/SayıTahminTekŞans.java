package b�l�m05;

import java.util.Scanner;

public class Say�TahminTek�ans {

	public static void main(String[] args) {
           int say� = (int)(Math.random() * 101);
           
           Scanner java = new Scanner(System.in);
           System.out.println("0 il 100 aras�nda bir say� girin");
           int tahmin = java.nextInt();
           
           System.out.println("Tuttu�umuz say� :" + say�);
           
           if(say� == tahmin) {
        	   System.out.println("Bildiniz");
           } else if(say� < tahmin) {
        	   System.out.println("B�y�k bir say� girdiniz");
           } else {
        	   System.out.println("K���k bir say� girdiniz");
           }
           java.close();
	}

}
