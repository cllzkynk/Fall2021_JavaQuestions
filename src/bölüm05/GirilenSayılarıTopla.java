package b�l�m05;

import java.util.Scanner;

public class GirilenSay�lar�Topla {

	public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        
        System.out.println("Toplanacak say�y� giriniz.��k�� i�in s�f�r giriniz");
        int say� = java.nextInt();
        
        int toplam = 0;
        while(say� != 0) {
        	toplam += say�;
        	System.out.println("Toplanacak say�y� giriniz.��k�� i�in s�f�r giriniz");
        	say� = java.nextInt();
        }
        System.out.println("Toplam = " + toplam);
        java.close();
	}

}
