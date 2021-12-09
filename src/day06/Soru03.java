package day06;

import day05_StringManipulation_10112021.PalindromeString;

public class Soru03 extends Soru02 {

	public static void main(String[] args) {
		
		//1.yontem methodu kullanmak istedigim Class'dan bir obje olusturup
		// o obje uzerinden o Class'daki tum methodlara ulasabilirim
		Soru02 soru02=new Soru02();
		soru02.ayBul(5);
		
		
		
		// 2. yontem inheritence
		
		ayBul(4);
		System.out.println(isim);
		
		PalindromeString soru01 =new PalindromeString();
		
		String kelimesoru03="hasan";
		soru01.palindromeBul(kelimesoru03);

	}

}
