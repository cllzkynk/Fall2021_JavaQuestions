package day01;

import java.util.Scanner;


public class Question04 {
		
	/*Soru 4:
	 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
     * 3. Adim : Ekrana yazdiralim.				
       	INPUT      : 41			
        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
			
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//byte
		System.out.println("Lutfen byte veri tipinde bir veri giriniz");
		byte byteData = scan.nextByte();
		System.out.println("Girdiginiz byte veri tipindeki deger: " + byteData);
		
		//short
		System.out.println("Lutfen short veri tipinde bir veri giriniz");
		short shortData = scan.nextShort();
		System.out.println("Girdiginiz short veri tipindeki deger: " + shortData);
		
		//boolean
		System.out.println("Lutfen boolean veri tipinde bir veri giriniz");
		boolean booleanData = scan.nextBoolean();
		System.out.println("Girdiginiz boolean veri tipindeki deger: " + booleanData);
		
	}
}