package day01;

import java.util.Scanner;


public class Question03 {

	/*
     * Kullanicidan uc basamakli bir sayi alin
     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     *
     *
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
     *
     *
     */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen uc basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int yuzler = sayi/100, onlar = sayi/10%10, birler = sayi%10;
		
		//System.out.println(yuzler + " " + onlar + " " + birler);
		
		if(sayi>99 && sayi<1000){
			System.out.println("Girdiginiz sayinin birler basamagi : " + birler);
			System.out.println("Girdiginiz sayinin onlar basamagi : " + onlar);
			System.out.println("Girdiginiz sayinin yuzler basamagi :" + yuzler);
		}else{
			System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		}
		
		scan.close();
	}

}
