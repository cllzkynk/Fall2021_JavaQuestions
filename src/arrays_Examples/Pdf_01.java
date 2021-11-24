package arrays_Examples;


public class Pdf_01 {

	public static void main(String[] args) {


		
		// int array [][]= {{1,2,3} , {4,5,6}};  tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
		
		
		int multi [][] = {{1,2,3} , {4,5,6}};
		
		
	/*	
		multi [0][0] 1		multi [1][0] 4		=	4		
		multi [0][0] 1		multi [1][1] 5		=	5	
		multi [0][0] 1		multi [1][2] 6		=	6	
		
		multi [0][1] 2		multi [1][0] 4		=	8		
		multi [0][1] 2		multi [1][1] 5		=	10	
		multi [0][1] 2		multi [1][2] 6		=	12
		
		multi [0][2] 3		multi [1][0] 4		=	12		
		multi [0][2] 3		multi [1][1] 5		=	15	
		multi [0][2] 3		multi [1][2] 6		=	18
		
	 														*/
		
		// int multi [][] = {{1,2,3} , {4,5,6}};
		
		
		for (int i = 0; i <=2; i++) {
			
			
			
			for (int j = 0; j < 3; j++) {
				
				
				System.out.print(multi[0][i] * multi[1][j] + " ");
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
