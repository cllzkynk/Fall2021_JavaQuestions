package bolum02 ;

import java.util.Scanner;

public class KullaniciGirdisiyleAlanHesaplama {
	public static void main(String[]args) {
	    Scanner girdi =new Scanner(System.in);
		
		double yaricap;
		double alan;
		
		//yar�cap� oku
		System.out.println("Alan� hesaplanacak �emberin yar��ap�n� giriniz ");
		yaricap =girdi.nextDouble();
		
		//alan� hesapla
		alan = yaricap * yaricap *3.14159;
		
		//alan� yazd�r
		System.out.println("yar�cap� " + yaricap + " olan �emberin alan�:" + alan + " d�r");
		

}
}
