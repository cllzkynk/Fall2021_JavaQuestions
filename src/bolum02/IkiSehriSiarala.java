package bolum02 ;

import java.util.Scanner;

public class IkiSehriSiarala {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir �ehir giriniz");
		String sehir1 = klavye.next();
		
		System.out.println("Bir �ehir daha giriniz");
		String sehir2 = klavye.next();
		
		if(sehir1.compareTo(sehir2) < 0) {//Sehir1 integer olarak �ehir2 den k���kse, demek bu..
			System.out.println("�ehirleri s�ral� �ekilde yazd�r�yoruz :" + sehir1 + " " + sehir2);
		} else {
			System.out.println("�ehirleri s�ral� �ekilde yazd�r�yoruz :" + sehir2 + " " + sehir1);
		}
	}

}
