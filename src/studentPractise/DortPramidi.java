package studentPractise;

import java.util.Scanner;

public class DortPramidi {

	 public static void main(String args[]) {
		 
		 
	        Scanner inp = new Scanner(System.in);
	        System.out.print("Say�y� giriniz: ");
	        int sayi = inp.nextInt();
	 
	       for(int i = 0;i<=sayi-1;i++){
	 
	           int pow = 1;
	           for(int j = 1 ;j<= sayi*2-1; j++){ //Her seferinde 2n-1 defa d�necek.
	 
	               if(j>=sayi-i && j<=sayi+i){ //E�er bu aral�kta ise yazacak aral�kta de�ilse bo�luk b�rakacak
	 
	                   System.out.printf("%6d",pow); //printf kullanmam�z�n sebebi bo�luklar� ayarlamak
	 
	                   if(j<=sayi-1) //Ortadaki say�ya kadar 4 ile �arp�lacak , sonrasonda 4 e b�l�necek
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