package InterviewSorulari;

public class Java_20_ReverseNumber {

	public static void main(String[] args) {

		// ReverseNumber

		yol1();

		yol2();

		yol3();

	}

	private static void yol3() {
		StringBuilder sb= new StringBuilder("1234");
		System.out.println("Sayinin tersi 3. yol : " + sb.reverse());

	}

	private static void yol2() {
		String num1="1234";
		String rev1="";
		for (int i = 0; i < num1.length(); i++) {
			System.out.print(num1.substring(num1.length()-1-i, num1.length()-i));

		}
		System.out.println();
	}

	private static void yol1() {
		int num = 1234;
		int rev = 0;

		while(num !=0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num/10;
		}
		System.out.println("Sayinin tersi 1. yol : " + rev);
	}


}
