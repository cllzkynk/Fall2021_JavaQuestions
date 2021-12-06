package bölüm04;

import java.util.Scanner;

public class KarakterAnalizi {
	public static void main(String[] args) {
		Scanner girdi =new Scanner(System.in);
		
		System.out.println("Lütfen isminizi girin");
		 char ch = girdi.next().charAt(0);
		 
		 if(ch >= 'A' && ch <= 'Z') {
			 System.out.println(ch + " büyük harf");
		 } else if(ch >= 'a' && ch <= 'z') {
			 System.out.println(ch + " Küçük harf");
		 } else if('0' <= ch && ch <= '9') {
			 System.out.println(ch + " bir sayýdýr");
		 }
		 girdi.close();
	}

}
