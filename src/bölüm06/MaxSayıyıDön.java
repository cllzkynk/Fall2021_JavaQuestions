package b�l�m06;

import java.util.Scanner;

public class MaxSay�y�D�n {
	public static void main(String[] args) {
		System.out.println("l�tfen iki say� giriniz");
		Scanner girdi = new Scanner(System.in);
		int i = girdi.nextInt();
		int k = girdi.nextInt();
		System.out.println("�K� say� aras�ndaki b�y�k olan " + max(i, k) + " dir");
		girdi.close();
	}
	
	public static int max(int num1, int num2) {
		int result = 0;
		if(num1 < num2)
			result = num2;
		if(num1 > num2)
			result = num1;
		if(num1 == num2)
			System.out.println("rakamlar e�it");
		return result;
		
	}
	

}
