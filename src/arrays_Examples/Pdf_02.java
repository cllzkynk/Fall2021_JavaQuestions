package arrays_Examples;

public class Pdf_02 {

	public static void main(String[] args) {


		// { {1,2,3} , {4,5} , {6} }  multi dimensiyon arrayin ic array'lerindeki son elemanlarinin carpimini yazdiran kodu yaziniz.
		
		
		/*
		 
		 multi[0][2]  *  multi[1][1] * multi[2][0] = sonuc
		
		
		
		
									*/
		
		int multi [][] = { {1,2,3} , {4,5} , {6} };
		
		
		//						3		x		5		x	  6 	= 90
		System.out.println(multi[0][2]  *  multi[1][1] * multi[2][0]);
		
		
		
	}

}
