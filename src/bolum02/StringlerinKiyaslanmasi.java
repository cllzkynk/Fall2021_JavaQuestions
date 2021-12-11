package bolum02 ;

import java.util.Scanner;

public class StringlerinKiyaslanmasi {
	public static void main(String[] args) {
		String str1 = "Merhaba java";
		String str2 = "Merhaba java s�n�f�";

		boolean b = str1.equals(str2);
		if (b) { // boolean b true ise devam eder direk.de�ilse else ge�er
			System.out.println("iki string birbirine e�it");
		} else {
			System.out.println("Birbirine e�it de�il");
		}

		str1 = "jave";
		str2 = "java";
		int kiyaslamaDegeri = str1.compareTo(str2);// bu k�yaslama integer de�er olarak yap�l�r
													// str1 yi str2 ile k�yaslar
		if (kiyaslamaDegeri == 0) {
			System.out.println("e�it");
		} else if (kiyaslamaDegeri > 0) {
			System.out.println(str1 + " b�y�kt�r " + str2 + " den");
		} else {
			System.out.println(str1 + " k���kt�r " + str2 + " den");
		}
		
		str1 = "Welcome to Java";
		System.out.println(str1.startsWith("we"));
		System.out.println("Welcome to Java" .startsWith("we"));//str 1 diye atama yap�madan direk de yaz�labilir
		System.out.println("Welcome to Java" .endsWith("va"));//string va ile bitiyor mu
		System.out.println("Welcome to Java" .contains("To"));
		System.out.println("Welcome to Java" .contains("to"));
		
		String q = "Mehmet";
		String w = "mehmet";

		if (q.equalsIgnoreCase(w)) {
			System.out.println("iki dizi e�it");
		} else {
			System.out.println("e�it de�il");
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
