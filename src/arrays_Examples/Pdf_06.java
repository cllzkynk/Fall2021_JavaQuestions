package arrays_Examples;

import java.util.Arrays;

public class Pdf_06 {

	public static void main(String[] args) {


		//  Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
		//  Array olarak yazdiran bir method yaziniz
		
		
		int istenen=7;
		
		String str1 ="";
		
		
		int arr1[] = {11,3,7,19,1,5,13,15,13,13};
		
		
		Arrays.sort(arr1);
		
		
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i]!=istenen) {
				
				str1+=arr1[i]+" ";
	
			}
			
		}
		
		
		String arr2 [] = str1.split(" ");
		
		
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
