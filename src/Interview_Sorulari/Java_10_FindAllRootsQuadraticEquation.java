package InterviewSorulari;

import java.util.Scanner;

public class Java_10_FindAllRootsQuadraticEquation {

	public static void main(String[] args) {
		
     // Find all roots of a quadratic equation
	 // İkinci dereceden bir denklemin tum koklerini bulun
		

	    Scanner sc = new Scanner(System.in); 
        System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir."
        		+ "\n Denklemdeki sabitleri asagidaki gibi sirayla girin"); 
        
        System.out.print("a degerini giriniz :"); 
        double a = sc.nextInt(); 
        System.out.print("b degerini giriniz   :"); 
        double b = sc.nextInt(); 
        System.out.print("c degerini giriniz   :"); 
        double c = sc.nextInt(); 
        //diskriminant (delta)
        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin Gercel Koku Yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("Cakisik koku var x1= x2= " + x); 
        }
        
        /* 2. yol

         */
         /*Find all roots of a quadratic equation
			Δ= b^2-4ac
			Δ `da 3 durum var
				1)delta>0 kok formulu ile bulunur
				2)delta<0  reel(gercek) koku yoktur
				3)delta=0 ise kokler birbirine esittr
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Hatirlatma 2. der denk kalibi : ax2 + bx + c seklindedir"
				+ "\nLutfen denklemin katsayilarini sirasiyla giriniz (a,b,c)"
				+ "\nHer katsayidan sonra enter`a basiniz");
		double a= scan.nextInt();
		if (a==0) {
			System.out.print("Lutfen 2. der denk giriniz\na :");
			a= scan.nextInt();
		}
		double b= scan.nextInt();
		double c= scan.nextInt();
		
		delta(a,b,c);
		
		

	}

	private static void kokHesaplama(double karekokDelta, double a, double b, double c) {
		double x1= ((-1*b)+karekokDelta)/(2*a);
		double x2= ((-1*b)-karekokDelta)/(2*a);
		System.out.print ("Denklemin kokleri : x1=" + x1 + "  x2=" + x2 );
		System.out.printf("\nx1= %.2f ve x2= %.2f " ,x1,x2  );
		
	}

	private static double delta(double a, double b, double c) {
		//Formuldeki delta(Δ) yi burada buluyoruz
		double delta= (b*b)-(4*a*c);
		if (delta>0) {
			double karekokDelta= Math.sqrt(delta);
			kokHesaplama(karekokDelta,a,b,c);
		}
		else if(delta<0) {
			System.out.println("Denklemin Gercek koku yoktur");
		}
		else if(delta==0) {
			double x1= -1*b/(2*a);
			System.out.printf("Cakisik iki koku vardir. x1=x2=%.2f " , x1);
		}
		
		return delta;
		}
         */
 
        sc.close();
	}

}
