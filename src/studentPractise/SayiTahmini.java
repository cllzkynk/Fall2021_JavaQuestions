package studentPractise;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Say� tahmin oyununa ho� geldiniz!");
		System.out.println("L�tfen 1-100 aras�nda bir say� giriniz: ");
		// Kullan�c�dan say� al�yoruz
		int tahmin = input.nextInt();
		// Bilgisayardan rastgele say� al�yoruz
		int sayi = rnd.nextInt(101);
		while (tahmin != sayi) {
		if(tahmin < 0 || tahmin > 100 ) {
		System.out.println("1 ile 100 aras�nda bir de�er giriniz: ");
		tahmin = input.nextInt(); }
		else if (tahmin < sayi) {
		System.out.println("Daha b�y�k bir say� giriniz: ");
		tahmin = input.nextInt(); }
		else{
		System.out.println("Daha k���k bir say� giriniz: ");
		tahmin = input.nextInt();}
		}
		// E�er say�m�z ve tahmin birbirine e�itse while d�ng�s�ne girmez
		// ve print komutunu yazd�r�r�z
		System.out.println("Tebrikler, kazand�n�z!"); }
		}