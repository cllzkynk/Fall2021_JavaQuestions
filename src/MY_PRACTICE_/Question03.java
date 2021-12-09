package days04;

import java.util.ArrayList;
import java.util.List;

public class Question03 {
	/* bir multidimensional array'i parametre olarak kabul eden bir method yazin
     * bu method array'deki elemanlari arraylist'e aktarsin
     * ve arraylist'i natural order'a gore yazdirin
     *
     * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
     * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
     */

	public static void main(String[] args) {
		
		String arr[][]= {{"John","Brad" ,"Fox"},{"Lee","Ali"},{"Suzan"}};
		
		

	}
	public static void arrToList(String[][] arr) {
		
		List<String> arrList=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arrList.add(arr[i][j]);
				
			}
			System.out.println(arr[i]);
			
		}
	}

}


/*
 * 	/* bir multidimensional array'i parametre olarak kabul eden bir method yazin
 
     * bu method array'deki elemanlari arraylist'e aktarsin
     * ve arraylist'i natural order'a gore yazdirin
     *
     * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
     * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
     
​
	public static void main(String[] args) {
		
		String arr[][] = {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		arrToList(arr);
		
	}
	
	public static void arrToList(String[][] arr) {
		
		List<String> arrList = new ArrayList<>();
		
		// String arr[][] = {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arrList.add(arr[i][j]);
			}
		}
		System.out.println(arrList);
		
		Collections.sort(arrList);
		System.out.println(arrList);
		
	}
}
*/
