package studentPractiseSelected;

import java.util.Scanner;

public class TasKagit {
	 public static void main(String args[]) {
		 
	        //0-ta� //1-ka��t //2-makas
	        //3 yapan kazan�r
	 
	 
	        Scanner inp = new Scanner(System.in);
	 
	        int bilgisayarKazandi = 0;
	        int kullaniciKazandi = 0;
	 
	        while(bilgisayarKazandi<3 && kullaniciKazandi<3){ //3 yapan kazan�r
	            System.out.println("Ta�, Ka��t, Makas ?\n[0     1     2  ]"); //Kullan�c�dan de�er al�n�yor. //o,1,2 d��� kontrlleri siz eklersiniz
	            int kullanici = inp.nextInt(); //kullan�c�dan al�nan de�er kullanici de�i�kenine atand�
	            int bilgisayar = (int)(Math.random()*3); //bilgisiyar 0,1,2 random de�er olu�turuyor
	 
	 
	            System.out.print("Bilgisayar :"); //Bilgisayar�n de�eri yazd�r�l�yor
	            switch (bilgisayar)
	            {
	                case 0: System.out.println("Ta�."); break;
	                case 1: System.out.println("Ka��t."); break;
	                case 2: System.out.println("Makas.");
	            }
	 
	            System.out.print("Kullan�c� :"); //kullan�c� de�eri
	            switch (kullanici)
	            {
	                case 0: System.out.println("Ta�"); break;
	                case 1: System.out.println("Ka��t"); break;
	                case 2: System.out.println("Makas ");
	            }
	 
	            if(kullanici==bilgisayar){
	                System.out.println("Berabere");
	 
	            } else{
	                if((kullanici==0 && bilgisayar ==2) || (kullanici==1 && bilgisayar ==0) || (kullanici==2 && bilgisayar ==1)){
	                    System.out.println("Bu eli kullan�c� kazand�");
	                    kullaniciKazandi++;
	                }else{
	                    System.out.println("Bu eli bilgisayar kazand�");
	                    bilgisayarKazandi++;
	                }
	            }
	 
	            System.out.println("Kullan�c� : "+kullaniciKazandi+" - "+ "Bilgisayar : "+bilgisayarKazandi);
	 
	        }
	 
	 
	 
	        System.out.println(kullaniciKazandi==3 ? "KULLANICI KAZANDI":"B�LG�SAYAR KAZANDI");
	 
	    }
	 
	}