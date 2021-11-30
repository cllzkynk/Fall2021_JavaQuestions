package studentPractise;

import java.util.Scanner;

public class DortPramidi {

	 public static void main(String args[]) {
		 
		 
	        Scanner inp = new Scanner(System.in);
	        System.out.print("Sayýyý giriniz: ");
	        int sayi = inp.nextInt();
	 
	       for(int i = 0;i<=sayi-1;i++){
	 
	           int pow = 1;
	           for(int j = 1 ;j<= sayi*2-1; j++){ //Her seferinde 2n-1 defa dönecek.
	 
	               if(j>=sayi-i && j<=sayi+i){ //Eðer bu aralýkta ise yazacak aralýkta deðilse boþluk býrakacak
	 
	                   System.out.printf("%6d",pow); //printf kullanmamýzýn sebebi boþluklarý ayarlamak
	 
	                   if(j<=sayi-1) //Ortadaki sayýya kadar 4 ile çarpýlacak , sonrasonda 4 e bölünecek
	                       pow *= 4;
	                   else
	                       pow /= 4;
	 
	 
	               }else{
	                   System.out.printf("%6s","");
	               }
	 
	           }
	           System.out.println();
	       }
	 
	    }
	 
	}