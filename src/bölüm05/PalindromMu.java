package b�l�m05;

import java.util.Scanner;

public class PalindromMu {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir c�mle giriniz");
		String c�mle = java.nextLine().toLowerCase();
		
		boolean palindrom = true;
		
		for(int i = 0, j = c�mle.length() - 1; i < j; i++, j--) {
			if(c�mle.charAt(i) != c�mle.charAt(j)){
				palindrom = false;
				break;
				
			}
			
		}
		if(palindrom) {
			System.out.println(c�mle + " palindromdur");
		} else {
			System.out.println(c�mle + " palindrom de�ildir");
		}
		java.close();
	}

}
