package b�l�m07;

import java.util.Arrays;

public class Diziler {
	public static void main(String[] args) {
		int say�1;
		int say�2;
		int say�3;
		int say�4;
		int say�5;
		int say�6;
		int say�7;
		int say�8;
		int say�9;
		int say�10;
		
		int[] say�Dizisi;
		say�Dizisi = new int[20];
		
		int a = 5;
		int b = 10;
		
		double[] myList = new double[100];
		System.out.println(myList.length);
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[3] = 2.43;
		myList[4] = 4.65;
		myList[5] = 5.61;
		myList[6] = 3.6;
		myList[7] = 23.6;
		myList[8] = 5.0;
		myList[9] = 2.6;
		System.out.println(Arrays.toString(myList));
		
		char[] karakterDizisi = new char[1000];
		//Char variable type ilede array olu�turulabilir.
		
		int[] say�Dizisi2 = new int[200];
		for (int i = 0; i < say�Dizisi2.length; i++) {
			 say�Dizisi2[i] = i;			
		}
		System.out.println(Arrays.toString(say�Dizisi2));
		
		double[] benimListem = {1.9, 2.9, 3.4, 3.5};
		System.out.println(Arrays.toString(benimListem));
	}

}
