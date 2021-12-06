package bölüm02;

import java.util.Scanner;

public class ÞuankiSaatiGöster {
	public static void main(String[] args) {

		long toplamMilisaniye = System.currentTimeMillis();

	    System.out.println("toplamMilisaniye = " + toplamMilisaniye);
	    
	    long toplamSaniye = toplamMilisaniye / 1000;
	    
	    System.out.println("toplamSaniye = " + toplamSaniye);
	    
	    long suankiSaniye = toplamSaniye % 60;
	    System.out.println("suankiSaniye = " + suankiSaniye);
	    
	    long toplamDakika = toplamSaniye / 60;
	    System.out.println("toplamDakiak = " + toplamDakika);
	    
	    long suankiDakika = toplamDakika % 60;
	    System.out.println("suankiDakiaka = " + suankiDakika);
	    
	    long toplamSaat = toplamDakika / 60;
	    System.out.println("suankiSaat = " + toplamSaat);
	    
	    long suankiSaat = toplamSaat % 24;
	    System.out.println("suankiSaat = " + suankiSaat); // grýnwých e göre olduðu için 2 saat geri cýktý,
	    
	    System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT");
	    }

}
