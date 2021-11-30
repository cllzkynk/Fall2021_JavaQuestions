package studentPractise;

import java.util.Scanner;

public class Egim {
/*
 * Soru4: Kullan�c�dan x1,y1; x2,y2 koordinat noktalar�n� alarak iki nokta aras�ndaki e�imi bulan program� yaz�n�z.
E�im form�l� = (y�-y�)/(x�-x�) kullanacaks�n�z.
Ekstra: Ancak bu soruyu yaparken di�erlerinden farkl� olarak e�im hesaplama i�lemini bir metot i�erisinde yapt�r�n�z.
 */
	
	 public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        
	        double x1,y1,x2,y2;
	        System.out.print("Birinci nokta (x,y) => ");
	        x1 = input.nextDouble();
	        y1 = input.nextDouble();
	        System.out.print("�kinci nokta (x,y) => ");
	        x2 = input.nextDouble();
	        y2 = input.nextDouble();
	        //double egim = ((y2-y1)/(x2-x1));
	        //System.out.println("egim"+egim);
	        
	        //olu�turdu�umuz Egim metotunu burada kullan�yoruz.
	        System.out.println("E�im = "+Egim(x1,x2,y1,y2));
	        
	    }
	    //E�im ad�nda bir metot olu�turuyoruz.
	    public static double Egim(double x1,double x2,double y1,double y2)
	    {
	        double egim = ((y2-y1)/(x2-x1));
	        return(egim);
	    }
	    
	}

