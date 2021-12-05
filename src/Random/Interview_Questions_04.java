
package Random;

/**
 * @author CELÝL
 */
public class Interview_Questions_04 {
	/*
    From a given array find all pairs whose sum is a given number
verilen bir arraydeki, toplamý belirli bir sayý olan tüm çiftleri bulun
           For example; 
           input :  {4, 6, 5, -10, 8, 5, 20} ==> 10
           Output :  4 + 6 = 10, 5 + 5 = 10, -10 + 20 = 10 */
	
	
	public static void main(String[] args) {
		
		
		
		int [] arr={4, 6, 5, -10, 8, 5, 20};
		
		int kacaEsitolsun=10;	
		hallet(arr,kacaEsitolsun);
		
		
		System.out.println("\n<=>*<=>*<=>*<=><=>*<=>\n");
		
		int [] arr2= {1,2,3,4,5,6,7,8,9,10,11,12,-1,-2,-3,-4};		
		
		int kacaEsitolsun2=8;	
		hallet(arr2,kacaEsitolsun2);
		

	}

	public static void hallet(int[] arr, int toplam) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]+arr[j]==toplam) {
				System.out.println(arr[i] + " + " + arr[j] + " = " + toplam );
			}
		}
	}
		
	}

	

}
