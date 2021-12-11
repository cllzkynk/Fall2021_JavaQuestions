package bolum02_�l�m02;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static void main(String[] args) {
		Scanner ahmet = new Scanner(System.in);
		
		System.out.println("Ortlama hesaplamak i�in 3 say� giriniz");
		
		double say�1 = ahmet.nextDouble();
		double say�2 = ahmet.nextDouble();
		double say�3 = ahmet.nextDouble();
		
		double ortalama =(say�1 + say�2 + say�3)/3;
		 System.out.println("Girilen 3 say�n�n ortalamas� " + ortalama);
		
	}
}
