package studentPractise;

import java.util.Random;
import java.util.Scanner;

public class Mayin {


	    /**
	     * @param args the command line arguments
	     */
	    public static int[][] RastgeleDoldur (int satir, int sutun){
	        Random rnd=new Random();
	        
	        int [][] matris=new int [satir][sutun];
	        int i=0;
	        while (i<satir) {
	            int j=0;
	            while (j<sutun) {                
	                matris[i][j]=rnd.nextInt(2);
	                j=j+1;
	            }
	            i=i+1;
	        }
	        for (int k = 0; k < satir; k++) {
	            for (int l = 0; l < sutun; l++) {
	                
	                System.out.print(matris[k][l]+" ");
	                
	            }
	            System.out.println();  
	        }
	        return matris;
	    }
	    public static void main(String[] args) {
	         Scanner girdi=new Scanner(System.in);
	        System.out.println("Sat�r Boyutunu Giriniz");
	        int a=girdi.nextInt();
	        System.out.println("Sutun Boyutunu Giriniz");
	        int b=girdi.nextInt();
	        int [][] oyunMatrisi=RastgeleDoldur(a, b);
	        int puan=0;
	        boolean kontrol=true;
	        while (kontrol) {            
	            System.out.println("Se�ti�iniz Konum Sat�r De�erini Giriniz");
	            int x=girdi.nextInt();
	            System.out.println("Se�ti�iniz Konum Sutun De�erini Giriniz");
	            int y=girdi.nextInt();
	            if (oyunMatrisi[x][y]==1) {
	                kontrol=false;
	            }
	            else {
	                puan=puan+10;
	                System.out.println("Hala Hayattas�n Devam...");
	            }
	        }
	        System.out.println("Oyun Bitti! Puan�n�z: "+puan);
	        
	        
	        
	    }
	    
	}