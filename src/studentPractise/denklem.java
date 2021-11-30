package studentPractise;

import java.util.Scanner;

public class denklem {

	public static void main(String[] args) {
		

             String Denklem, xDegisken;

             Scanner scan=new Scanner (System.in);

             System.out.print("Denklemi giriniz: ");
             Denklem = scan.nextLine();
            
             System.out.print("x degisken degerini girin: ");
             xDegisken = scan.next();

             matematik DenklemCozucu = new matematik();

             DenklemCozucu.Coz(Denklem, xDegisken);
     }
}