package bölüm02;

import java.util.Scanner;

public class KullanýcýGirdisiyleAlanHesaplama {
	public static void main(String[]args) {
	    Scanner girdi =new Scanner(System.in);
		
		double yarýcap;
		double alan;
		
		//yarýcapý oku
		System.out.println("Alaný hesaplanacak çemberin yarýçapýný giriniz ");
		yarýcap =girdi.nextDouble();
		
		//alaný hesapla
		alan = yarýcap * yarýcap *3.14159;
		
		//alaný yazdýr
		System.out.println("yarýcapý " + yarýcap + " olan çemberin alaný:" + alan + " dýr");
		

}
}
