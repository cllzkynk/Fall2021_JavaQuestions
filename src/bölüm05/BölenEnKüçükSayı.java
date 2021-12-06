package bölüm05;

import java.util.Scanner;

public class BölenEnKüçükSayý {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int n = java.nextInt();
		int bölen = 2;
		
		
		while(bölen <= n) {
			if(n % bölen == 0) 
				break;
				bölen ++;
	
			
		}
		System.out.println(n + " sayýsýný bölen 1 den büyük en küçük sayý " + bölen);
		java.close();

	}

}
