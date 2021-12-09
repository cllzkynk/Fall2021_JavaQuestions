package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

@SuppressWarnings("unused")
public class C09 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin tersine ceviren bir java programi yaziniz.
		 * (Mulakat Sorusu)
		 * 
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
	
		 */
		

		// 1. yol
         
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz ");
		int sayi = scan.nextInt();
		
		int tersSayi=0;
		
		for (int i = sayi; i > 0; i/=10) {
			tersSayi*=10;
			tersSayi+=i%10;
			
		}
		System.out.println(tersSayi);
		scan.close();
		/*2. yol 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen tersine cevrilecek sayi giriniz: ");
		int sayi = scan.nextInt();
		int tersi = 0;
		int yedek = sayi;

		for (; sayi != 0; sayi /= 10) {
			int basamak = sayi % 10;
			tersi = tersi * 10 + basamak;
		}
	
		System.out.print("Sayinin Tersi: " + tersi);
		*/
		
		/* 3. yol

		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanici bir sayi giriniz ");
		int sayi = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();

		for (int i = sayi; i > 0; i /= 10) {
			int rakam = i % 10;
			list.add(rakam);
		}
		// System.out.println(list);
		 
		String sayiTers = "";

		for (int i = 0; i < list.size(); i++) {
			sayiTers += list.get(i);
		}
		int tersNo = Integer.parseInt(sayiTers);
		System.out.println(tersNo);
	}
		/*
		
		// 4. yol
		 
		 
		int tersi=0;
		
		while (sayi!=0) {
			tersi=10*tersi+sayi%10;
			sayi/=10;

		}
		
		System.out.print("Sayinin Tersi: " + tersi);*/

   
    }
}




