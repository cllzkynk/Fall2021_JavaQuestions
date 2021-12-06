package bölüm07;

import java.util.Arrays;

public class Diziler {
	public static void main(String[] args) {
		int sayı1;
		int sayı2;
		int sayı3;
		int sayı4;
		int sayı5;
		int sayı6;
		int sayı7;
		int sayı8;
		int sayı9;
		int sayı10;
		
		int[] sayıDizisi;
		sayıDizisi = new int[20];
		
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
		//Char variable type ilede array oluşturulabilir.
		
		int[] sayıDizisi2 = new int[200];
		for (int i = 0; i < sayıDizisi2.length; i++) {
			 sayıDizisi2[i] = i;			
		}
		System.out.println(Arrays.toString(sayıDizisi2));
		
		double[] benimListem = {1.9, 2.9, 3.4, 3.5};
		System.out.println(Arrays.toString(benimListem));
	}

}
