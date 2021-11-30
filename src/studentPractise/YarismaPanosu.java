package studentPractise;

import java.util.Scanner;

public class YarismaPanosu {
	 public static void CizgiCiz(){
	        for(int i=0; i<20; i++){
	            System.out.print("-");
	        }
	        System.out.print("-n");
	    }
	



	    public static void main(String[] args)  {
	   
	        int ySayisi,sSayisi = 0;
	    Scanner scan=new Scanner (System.in);
	       
	        System.out.println("Kac yarismaci yarisacak? ");
	        ySayisi = Integer.valueOf(scan.nextInt());
	        //ySayisi =new Integer(scan.nextInt()); Böylede olabilir
	       
	        System.out.println("Kac soru cevaplanacak? ");
	        sSayisi = Integer.valueOf(scan.nextInt());
	       
	        String[][] cevaplar = new String[ySayisi][sSayisi];
	       
	        for(int i=0;i<cevaplar.length;i++)
	        {
	            for(int j=0;j<cevaplar[i].length;j++)
	            {
	                System.out.println((i+1)+". yarismacinin "+(j+1)+" sorusunun cevabý:    ");
	                cevaplar[i][j] = scan.nextLine();
	            }
	        }
	       
	        YarismaPanosu.CizgiCiz();

	        System.out.print("t");
	        for(int i=0;i<ySayisi;i++)
	        {
	            System.out.print((i+1)+".Yarismaci    ");
	        }
	       
	        YarismaPanosu.CizgiCiz();
	       
	        for(int i=0;i<sSayisi;i++)
	        {
	            System.out.print((i+1)+".");
	           
	            for(int j=0;j<ySayisi;j++)
	            {
	                System.out.print("t     "+cevaplar[j][i]+"    ");
	            }
	            System.out.println();
	        }
	    }
	}
	 