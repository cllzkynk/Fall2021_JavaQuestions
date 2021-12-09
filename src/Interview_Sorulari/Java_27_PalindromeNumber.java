package InterviewSorulari;

import java.util.Scanner;

public class Java_27_PalindromeNumber {

	public static void main(String[] args) {

		//PalindromeNumber

		yol1();

		yol2();

		yol3();

	}



	private static void yol3() {
		int r,sum=0,temp;
		int n=454; //It is the number variable to be checked for palindrome

		temp=n;
		while(n>0){
			r=n%10;  //getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(sum + " palindrome number ");
		else
			System.out.println("not palindrome");
	}


	private static void yol2() {
		int num = 121;
		int rev = 0;

		int actualNum = num;

		while(num !=0) {
			int n = num % 10;
			rev = rev*10 + n;
			num = num/10;
		}

		System.out.println(rev);

		if(actualNum == rev) {
			System.out.println(actualNum + " is a palindrome");
		}else {
			System.out.println(actualNum +" is not a palindrome");
		}
	}

	private static void yol1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi Giriniz : ");
		int palindrom = scan.nextInt();
		int ilkdeger = palindrom;
		int length = String.valueOf(palindrom).length();

		int kalan, deger = 0;
		for (int i = 0; i < length; i++) {

			kalan = palindrom % 10;
			deger = deger * 10 + kalan;
			palindrom = palindrom / 10;
		}

		if (deger == ilkdeger) {
			System.out.println(deger + " Palindrom Sayidir.");
		} else {
			System.out.println(deger + " Palindrom Sayi Degildir.");
		}
	}
}


