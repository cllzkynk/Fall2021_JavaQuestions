package bolum02;

import java.util.Scanner;

public class BolenEnKucukSayi {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int n = java.nextInt();
		int bolen = 2;
		
		
		while(bolen <= n) {
			if(n % bolen == 0) 
				break;
				bolen ++;
	
			
		}
		System.out.println(n + " say�s�n� b�len 1 den b�y�k en k���k say� " + bolen);
		java.close();

	}

}
