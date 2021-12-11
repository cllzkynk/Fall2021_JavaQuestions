package bolum02 ;

import java.util.Scanner;

public class PalindromMu {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		
		System.out.println("Bir c�mle giriniz");
		String cumle = java.nextLine().toLowerCase();
		
		boolean palindrom = true;
		
		for(int i = 0, j = cumle.length() - 1; i < j; i++, j--) {
			if(cumle.charAt(i) != cumle.charAt(j)){
				palindrom = false;
				break;
				
			}
			
		}
		if(palindrom) {
			System.out.println(cumle + " palindromdur");
		} else {
			System.out.println(cumle + " palindrom de�ildir");
		}
		java.close();
	}

}
