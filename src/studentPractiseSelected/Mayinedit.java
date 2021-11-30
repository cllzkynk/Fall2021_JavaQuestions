package studentPractiseSelected;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mayinedit {


	    public static int[][] RastgeleDoldur (int a, int b){
	        Random rnd=new Random();
	        
	        int [][] matris=new int [a][b];
	        int i=0;
	        while (i<a) {     // atama foru for yerine while ile denedim
	            int j=0;
	            while (j<b) {                
	                matris[i][j]=rnd.nextInt(2);  // 0 ve 1den rastgele birini atayacak 1 mayin var 0 yok
	                j=j+1;
	            }
	            i=i+1;
	        }
	       /* for (int k = 0; k < a; k++) { // yazdirma foru
	            for (int l = 0; l < b; l++) { // 1 ve 0 lar gorunuyor bunda gorunemesi alttaki foru kulanarak gizledim
	                
	                System.out.print(matris[k][l]+" ");
	                
	            }
	            System.out.println();  
	        } */
	        for (int k = 0; k < a; k++) { 
	            for (int l = 0; l < b; l++) { 
	                
	                	System.out.print("☯"+" ");
					
	           
	            }
	            System.out.println();  }
	        return matris;
	    }
	    
	    public static void main(String[] args) {
	        // satur ve surun kullanicidan alabiliriz ama biraz daha gercek oyun gibi olsun diye zorluk derecesi girdirecegim
	    	
	    	/* Scanner scan=new Scanner(System.in);
	        System.out.println("Satır Boyutunu Giriniz");
	        int a=scan.nextInt();
	        System.out.println("Sutun Boyutunu Giriniz");
	        int b=scan.nextInt(); */
	    	
	    	 int a=0; int b=0 ;
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("Lutfen zorluk derecesini  [1-4] 1 kolay 4 en zor seklinde giriniz.");
	    	int zorluk=scan.nextInt();
	    	if (zorluk==1) {
				  a=5;
				  b=5;
			} if (zorluk==2) {
				  a=10;
				  b=10;
			}
			if (zorluk==3) {
				  a=15;
				  b=15;
			}
			if (zorluk==4) {
				  a=20;
				  b=20;
			}
	    	
	        int [][] oyunMatrisi=RastgeleDoldur(a, b);
	        
	   
	        int puan=0;
	        boolean kontrol=true;
	        while (kontrol) {            
	            System.out.println("Seçtiğiniz Konum Satır Değerini Giriniz");
	            int x=scan.nextInt();
	            System.out.println("Seçtiğiniz Konum Sutun Değerini Giriniz");
	            int y=scan.nextInt();
	            if (oyunMatrisi[x][y]==1) { // girilen konumda mayin varmi yani bir mi degil mi diye bakacak 
	                kontrol=false; // mayin varsa kontrol false ve while kirilacak
	            }
	            else {
	                puan=puan+10;
	                System.out.println("Hala Hayattasın. Puanin "+puan+" Devam..."); // mayin yoksa kontrol true olmaya devam edecek
	            }
	        }
	        System.out.println("Oyun Bitti! Puanınız: "+puan);
	        
	        //istersek sonunda mayin tarlasinin acik halini yazdirabiliriz. en sonunda nerde mayin varmis gormek icin
	        
	        for (int i = 0; i < oyunMatrisi.length; i++) {
				for (int j = 0; j < oyunMatrisi.length; j++) {
					if(oyunMatrisi[i][j]==1) {
						System.out.print("✹ ");
					}else if(oyunMatrisi[i][j]==0) {
						System.out.print("❀ ");
					}
				}  // ☢ 🌟☺ ㋛
				System.out.println();
			}
	        
	    }
	    
	}