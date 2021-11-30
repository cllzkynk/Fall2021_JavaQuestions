package studentPractise;

import java.util.Scanner;

public class Egim {
/*
 * Soru4: Kullanýcýdan x1,y1; x2,y2 koordinat noktalarýný alarak iki nokta arasýndaki eðimi bulan programý yazýnýz.
Eðim formülü = (y²-y¹)/(x²-x¹) kullanacaksýnýz.
Ekstra: Ancak bu soruyu yaparken diðerlerinden farklý olarak eðim hesaplama iþlemini bir metot içerisinde yaptýrýnýz.
 */
	
	 public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        
	        double x1,y1,x2,y2;
	        System.out.print("Birinci nokta (x,y) => ");
	        x1 = input.nextDouble();
	        y1 = input.nextDouble();
	        System.out.print("Ýkinci nokta (x,y) => ");
	        x2 = input.nextDouble();
	        y2 = input.nextDouble();
	        //double egim = ((y2-y1)/(x2-x1));
	        //System.out.println("egim"+egim);
	        
	        //oluþturduðumuz Egim metotunu burada kullanýyoruz.
	        System.out.println("Eðim = "+Egim(x1,x2,y1,y2));
	        
	    }
	    //Eðim adýnda bir metot oluþturuyoruz.
	    public static double Egim(double x1,double x2,double y1,double y2)
	    {
	        double egim = ((y2-y1)/(x2-x1));
	        return(egim);
	    }
	    
	}

