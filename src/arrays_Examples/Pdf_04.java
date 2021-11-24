package arrays_Examples;

import java.util.Arrays;

public class Pdf_04 {

	public static void main(String[] args) {


		/*Soru 4) 		Asagidaki multi dimensional array段n ic array値erindeki tum elemanlarin toplamini
					birer birer bulan ve herbir sonucu yeni bir array段n elemani yapan ve yeni array段 ekrana
					yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
					Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}				*/
		
		
		
		int arr1 [][] = { {1,2,3}, {4,5}, {6,7} };
		
		int toplam1 = 0;
		int toplam2 = 0;
		int toplam3 = 0;
		
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (i==0) {
				for (int j = 0; j < arr1[0].length; j++) {
					
					toplam1+=arr1[i][j];
				}
			} else if (i==1) {
				
				for (int j = 0; j < arr1[i].length; j++) {
					
					toplam2+=arr1[i][j];
				}
			} else {
				
				for (int j = 0; j < arr1[i].length; j++) {
					
					toplam3+=arr1[i][j];
			}
			
			
			}	
		}
		
		int yeniArr [] = {toplam1,toplam2,toplam3};
		
		
		System.out.println(Arrays.toString(yeniArr));
		
		
	}

	}
