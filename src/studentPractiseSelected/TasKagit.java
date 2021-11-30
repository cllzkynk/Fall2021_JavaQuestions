package studentPractiseSelected;

import java.util.Scanner;

public class TasKagit {
	 public static void main(String args[]) {
		 
	        //0-taþ //1-kaðýt //2-makas
	        //3 yapan kazanýr
	 
	 
	        Scanner inp = new Scanner(System.in);
	 
	        int bilgisayarKazandi = 0;
	        int kullaniciKazandi = 0;
	 
	        while(bilgisayarKazandi<3 && kullaniciKazandi<3){ //3 yapan kazanýr
	            System.out.println("Taþ, Kaðýt, Makas ?\n[0     1     2  ]"); //Kullanýcýdan deðer alýnýyor. //o,1,2 dýþý kontrlleri siz eklersiniz
	            int kullanici = inp.nextInt(); //kullanýcýdan alýnan deðer kullanici deðiþkenine atandý
	            int bilgisayar = (int)(Math.random()*3); //bilgisiyar 0,1,2 random deðer oluþturuyor
	 
	 
	            System.out.print("Bilgisayar :"); //Bilgisayarýn deðeri yazdýrýlýyor
	            switch (bilgisayar)
	            {
	                case 0: System.out.println("Taþ."); break;
	                case 1: System.out.println("Kaðýt."); break;
	                case 2: System.out.println("Makas.");
	            }
	 
	            System.out.print("Kullanýcý :"); //kullanýcý deðeri
	            switch (kullanici)
	            {
	                case 0: System.out.println("Taþ"); break;
	                case 1: System.out.println("Kaðýt"); break;
	                case 2: System.out.println("Makas ");
	            }
	 
	            if(kullanici==bilgisayar){
	                System.out.println("Berabere");
	 
	            } else{
	                if((kullanici==0 && bilgisayar ==2) || (kullanici==1 && bilgisayar ==0) || (kullanici==2 && bilgisayar ==1)){
	                    System.out.println("Bu eli kullanýcý kazandý");
	                    kullaniciKazandi++;
	                }else{
	                    System.out.println("Bu eli bilgisayar kazandý");
	                    bilgisayarKazandi++;
	                }
	            }
	 
	            System.out.println("Kullanýcý : "+kullaniciKazandi+" - "+ "Bilgisayar : "+bilgisayarKazandi);
	 
	        }
	 
	 
	 
	        System.out.println(kullaniciKazandi==3 ? "KULLANICI KAZANDI":"BÝLGÝSAYAR KAZANDI");
	 
	    }
	 
	}