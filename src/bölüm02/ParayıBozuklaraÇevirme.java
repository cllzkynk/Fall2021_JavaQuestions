package bölüm02;

import java.util.Scanner;

public class ParayıBozuklaraÇevirme {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		// bu örneği ben uzun yoldn yaptım.Normal çözümü mod alaral yapılmalı..
		
		
		System.out.println("Lütfen para miktarını giriniz : ");
		
		double paraMiktarı = girdi.nextDouble();
		
		//int birLiraMiktarı = (int)(paraMiktarı * 100) / 100;
		//System.out.println(birLiraMiktarı);
		
	    //int elliKuruşMiktarı = (int)((paraMiktarı - birLiraMiktarı) * 100) / 50 ;
		//System.out.println(elliKuruşMiktarı);
		
		//int onKuruşMiktarı = (int)(((paraMiktarı - birLiraMiktarı - elliKuruşMiktarı * 0.5) * 100) / 10);
		//System.out.println(onKuruşMiktarı);
		
		//int beşKuruşMiktarı = (int)(((paraMiktarı - birLiraMiktarı - elliKuruşMiktarı * 0.5 - onKuruşMiktarı * 0.1) * 100) / 5);
		//System.out.println(beşKuruşMiktarı);
		
		//int birKuruşMiktarı = (int)(paraMiktarı * 100) % 5;
		//System.out.println(birKuruşMiktarı);
		
		//System.out.println(paraMiktarı + " tl de " + birLiraMiktarı + " adet 1 tl " 
		//+ elliKuruşMiktarı + " adet 50 kuruş " + onKuruşMiktarı + " adet 10 kuruş "
		//+ beşKuruşMiktarı + " adet 5 kuruş " + birKuruşMiktarı + " adet 1 kuruş vardır. ");
		
		int toplamKuruş = (int)(paraMiktarı * 100);
		int toplamBirTl = toplamKuruş / 100;
		int kalanKuruş = toplamKuruş % 100;
		System.out.println("Bir tl miktarı : " + toplamBirTl);
		
		int toplamElliKuruş = kalanKuruş / 50;
		kalanKuruş = kalanKuruş % 50;
		System.out.println("50 kuruş miktarı: " + toplamElliKuruş);
		
		int toplamOnKuruş = kalanKuruş / 10;
		kalanKuruş %= 10;
		System.out.println("10 kuruş miktarı " + toplamOnKuruş);
		
		int toplamBeşKuruş = kalanKuruş / 5;
		kalanKuruş %= 5;
		System.out.println("5 kuruş miktarı : " + toplamBeşKuruş);
		
		System.out.println("1 kuruş miktarı :" + kalanKuruş);
	}

}
