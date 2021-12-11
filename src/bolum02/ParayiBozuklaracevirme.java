package bolum02 ;

import java.util.Scanner;

public class ParayiBozuklaracevirme {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		// bu �rne�i ben uzun yoldn yapt�m.Normal ��z�m� mod alaral yap�lmal�..
		
		
		System.out.println("L�tfen para miktar�n� giriniz : ");
		
		double paraMiktari = girdi.nextDouble();
		
		//int birLiraMiktar� = (int)(paraMiktar� * 100) / 100;
		//System.out.println(birLiraMiktar�);
		
	    //int elliKurusMiktar� = (int)((paraMiktar� - birLiraMiktar�) * 100) / 50 ;
		//System.out.println(elliKurusMiktar�);
		
		//int onKurusMiktar� = (int)(((paraMiktar� - birLiraMiktar� - elliKurusMiktar� * 0.5) * 100) / 10);
		//System.out.println(onKurusMiktar�);
		
		//int be�KurusMiktar� = (int)(((paraMiktar� - birLiraMiktar� - elliKurusMiktar� * 0.5 - onKurusMiktar� * 0.1) * 100) / 5);
		//System.out.println(be�KurusMiktar�);
		
		//int birKurusMiktar� = (int)(paraMiktar� * 100) % 5;
		//System.out.println(birKurusMiktar�);
		
		//System.out.println(paraMiktar� + " tl de " + birLiraMiktar� + " adet 1 tl " 
		//+ elliKurusMiktar� + " adet 50 Kurus " + onKurusMiktar� + " adet 10 Kurus "
		//+ be�KurusMiktar� + " adet 5 Kurus " + birKurusMiktar� + " adet 1 Kurus vard�r. ");
		
		int toplamKurus = (int)(paraMiktari * 100);
		int toplamBirTl = toplamKurus / 100;
		int kalanKurus = toplamKurus % 100;
		System.out.println("Bir tl miktar� : " + toplamBirTl);
		
		int toplamElliKurus = kalanKurus / 50;
		kalanKurus = kalanKurus % 50;
		System.out.println("50 Kurus miktar�: " + toplamElliKurus);
		
		int toplamOnKurus = kalanKurus / 10;
		kalanKurus %= 10;
		System.out.println("10 Kurus miktar� " + toplamOnKurus);
		
		int toplamBesKurus = kalanKurus / 5;
		kalanKurus %= 5;
		System.out.println("5 Kurus miktar� : " + toplamBesKurus);
		
		System.out.println("1 Kurus miktar� :" + kalanKurus);
	}

}
