package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 2 tamsayi girmesini ve ardindan GCD (En Buyuk Ortak Bolen) ve
		 * LCM'yi (En Kucuk Ortak Kat) bulmasini isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 40
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10
 
		 * 30 ve 40 icin LCM = 120
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz : \nBirinci sayiyi girdikten sonra Enter 'a basiniz ");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int ebob=0;
		int ekok=0;
		
		int max=sayi1*sayi2;
		
		for (int i = 1; i <sayi1; i++) {
			
			if (sayi1%i==0 && sayi2%i==0) {
				ebob=i;
				
			}
		}
		System.out.println("Ebob : "+ ebob); 
		
		for (int i = max; i > 0; i--) { 
			if (i%sayi1==0 && i%sayi2==0) {
				ekok=i;
			}
		}
		System.out.println("Ekok : "+ ekok);

		
		scan.close();
		
	}

}
