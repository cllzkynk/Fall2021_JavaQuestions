package arrays_Examples;

public class Pdf_03 {

	public static void main(String[] args) {

		/*		Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
			elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) 
			arr1 = { {1,2},{3,4,5}, {6} }         ve       arr2 = { {7,8,9}, {10,11}, {12} }  					*/
	
	
	
	/*Bu ornek icin asagidaki sonuclari verecek.
	 * 
	 * arr1[0][0]   +	arr2[0][0]	=	8
	 * 
	 * arr1[0][1]	+	arr2[0][1]	=	10	
	 * 
	 * arr1[1][0]	+	arr2[1][0]	=	13
	 * 
	 * arr1[1][1]	+	arr2[1][1]	=	15
	 * 
	 * arr1[2][0]	+	arr2[2][0]	=	18
	 * 
	 * 
	 * 
	 */
	
	
	int arr1 [][] = { {1,2},{3,4,5}, {6} };
	
	
	int arr2 [][] = { {7,8,9}, {10,11}, {12} };  					
			
	int kucuk=0;
	int toplam =0;
			
	
	
	if (arr1.length>arr2.length) {
		
		kucuk = arr2.length;
		
	} else if (arr1.length<arr2.length) {
		
		kucuk = arr1.length;
		
	} else {
		
		kucuk = arr1.length;
	}
	
	
		
		for (int j = 0; j < kucuk ; j++) {
			
			if (arr1[j].length < arr2[j].length) {  
				
				for (int i = 0; i < arr1[j].length; i++) {
					
					System.out.println("arr1["+ j+"]["+i+"]"+" + arr2["+ j+"]["+i+"] = "+(arr1[j][i] + arr2[j][i])+"\t("+arr1[j][i]+"+"+arr2[j][i]+")");
					System.out.println();
					toplam+=arr1[j][i] + arr2[j][i];
				} 
				
				
			} else if  (arr1[j].length > arr2[j].length) {
				
				for (int i = 0; i < arr2[j].length; i++) {
					
					System.out.println("arr1["+ j+"]["+i+"]"+" + arr2["+ j+"]["+i+"] = "+(arr1[j][i] + arr2[j][i])+"\t("+arr1[j][i]+"+"+arr2[j][i]+")");
					System.out.println();
					toplam+=arr1[j][i] + arr2[j][i];

				} 
				
				
				
			}else {
					for (int i = 0; i < arr2[j].length; i++) {
					
						System.out.println("arr1["+ j+"]["+i+"]"+" + arr2["+ j+"]["+i+"] = "+(arr1[j][i] + arr2[j][i])+"\t("+arr1[j][i]+"+"+arr2[j][i]+")");
						System.out.println();
					toplam+=arr1[j][i] + arr2[j][i];

				} 
				
			}
			
			
			
			
		}
		System.out.println("");
		System.out.println("Toplam__________________= "+toplam);
	
	
}

}
