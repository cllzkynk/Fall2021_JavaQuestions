package b�l�m05;

import java.util.Scanner;

public class B�lenEnK���kSay� {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int n = java.nextInt();
		int b�len = 2;
		
		
		while(b�len <= n) {
			if(n % b�len == 0) 
				break;
				b�len ++;
	
			
		}
		System.out.println(n + " say�s�n� b�len 1 den b�y�k en k���k say� " + b�len);
		java.close();

	}

}
