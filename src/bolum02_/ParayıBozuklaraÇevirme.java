package bolum02_�l�m02;

import java.util.Scanner;

public class Paray�Bozuklara�evirme {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		// bu �rne�i ben uzun yoldn yapt�m.Normal ��z�m� mod alaral yap�lmal�..
		
		
		System.out.println("L�tfen para miktar�n� giriniz : ");
		
		double paraMiktar� = girdi.nextDouble();
		
		//int birLiraMiktar� = (int)(paraMiktar� * 100) / 100;
		//System.out.println(birLiraMiktar�);
		
	    //int elliKuru�Miktar� = (int)((paraMiktar� - birLiraMiktar�) * 100) / 50 ;
		//System.out.println(elliKuru�Miktar�);
		
		//int onKuru�Miktar� = (int)(((paraMiktar� - birLiraMiktar� - elliKuru�Miktar� * 0.5) * 100) / 10);
		//System.out.println(onKuru�Miktar�);
		
		//int be�Kuru�Miktar� = (int)(((paraMiktar� - birLiraMiktar� - elliKuru�Miktar� * 0.5 - onKuru�Miktar� * 0.1) * 100) / 5);
		//System.out.println(be�Kuru�Miktar�);
		
		//int birKuru�Miktar� = (int)(paraMiktar� * 100) % 5;
		//System.out.println(birKuru�Miktar�);
		
		//System.out.println(paraMiktar� + " tl de " + birLiraMiktar� + " adet 1 tl " 
		//+ elliKuru�Miktar� + " adet 50 kuru� " + onKuru�Miktar� + " adet 10 kuru� "
		//+ be�Kuru�Miktar� + " adet 5 kuru� " + birKuru�Miktar� + " adet 1 kuru� vard�r. ");
		
		int toplamKuru� = (int)(paraMiktar� * 100);
		int toplamBirTl = toplamKuru� / 100;
		int kalanKuru� = toplamKuru� % 100;
		System.out.println("Bir tl miktar� : " + toplamBirTl);
		
		int toplamElliKuru� = kalanKuru� / 50;
		kalanKuru� = kalanKuru� % 50;
		System.out.println("50 kuru� miktar�: " + toplamElliKuru�);
		
		int toplamOnKuru� = kalanKuru� / 10;
		kalanKuru� %= 10;
		System.out.println("10 kuru� miktar� " + toplamOnKuru�);
		
		int toplamBe�Kuru� = kalanKuru� / 5;
		kalanKuru� %= 5;
		System.out.println("5 kuru� miktar� : " + toplamBe�Kuru�);
		
		System.out.println("1 kuru� miktar� :" + kalanKuru�);
	}

}
