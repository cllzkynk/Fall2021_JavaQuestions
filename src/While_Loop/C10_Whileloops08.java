package JavaKonusalSorular.WhileLoop;

import java.util.Scanner;

public class C10_Whileloops08 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirin.
        // Kullanicinin hata yapmadigini farz edin. Ornegin kullanici 3 girerse;
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Lutfen pozitif bir rakam giriniz: ");
        
        int rakam= scan.nextInt();
                
        int j=rakam;
        
        int i = 1;
        
        while (i<=10) {
          
            System.out.print(rakam+ "x" + i + "=" + j*i + " ");
            
            i++;
              
        }
        scan.close();
	}

}