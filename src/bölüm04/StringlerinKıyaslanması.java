package bölüm04;

import java.util.Scanner;

public class StringlerinKıyaslanması {
	public static void main(String[] args) {
		String str1 = "Merhaba java";
		String str2 = "Merhaba java sınıfı";

		boolean b = str1.equals(str2);
		if (b) { // boolean b true ise devam eder direk.değilse else geçer
			System.out.println("iki string birbirine eşit");
		} else {
			System.out.println("Birbirine eşit değil");
		}

		str1 = "jave";
		str2 = "java";
		int kıyaslamaDeğeri = str1.compareTo(str2);// bu kıyaslama integer değer olarak yapılır
													// str1 yi str2 ile kıyaslar
		if (kıyaslamaDeğeri == 0) {
			System.out.println("eşit");
		} else if (kıyaslamaDeğeri > 0) {
			System.out.println(str1 + " büyüktür " + str2 + " den");
		} else {
			System.out.println(str1 + " küçüktür " + str2 + " den");
		}
		
		str1 = "Welcome to Java";
		System.out.println(str1.startsWith("we"));
		System.out.println("Welcome to Java" .startsWith("we"));//str 1 diye atama yapımadan direk de yazılabilir
		System.out.println("Welcome to Java" .endsWith("va"));//string va ile bitiyor mu
		System.out.println("Welcome to Java" .contains("To"));
		System.out.println("Welcome to Java" .contains("to"));
		
		String q = "Mehmet";
		String w = "mehmet";

		if (q.equalsIgnoreCase(w)) {
			System.out.println("iki dizi eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println(q.toLowerCase());
		
	}	
	
	private static int compareTo(String str1, String str2) {
		if(str1.length() != str2.length()) {
			if(str1.length() > str2.length()) {
				return 1;
			}else {
				return -1;
			}
		}
		
		for (int i =0; i < str1.length(); i++) {
			char ch1 =str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(ch1 != ch2) {
				return ch1 -ch2;
				
			}
		}
			return 0;
		}
		
		
		
		
		
		

		

	

}
