package bölüm05;

import java.util.Scanner;

public class PalindromMu {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir cümle giriniz");
		String cümle = java.nextLine().toLowerCase();
		
		boolean palindrom = true;
		
		for(int i = 0, j = cümle.length() - 1; i < j; i++, j--) {
			if(cümle.charAt(i) != cümle.charAt(j)){
				palindrom = false;
				break;
				
			}
			
		}
		if(palindrom) {
			System.out.println(cümle + " palindromdur");
		} else {
			System.out.println(cümle + " palindrom deðildir");
		}
		java.close();
	}

}
