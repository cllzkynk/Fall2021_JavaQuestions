package level_2;

import java.util.Scanner;

public class Compare_Two_Strings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter first string ");
		String str1 = scan.nextLine();

		System.out.println("enter first string ");
		String str2 = scan.nextLine();

		compare(str1, str2);
		System.out.println("==>" + str1.compareTo(str2));
scan.close();
	}

	public static void compare(String str1, String str2) {
		if (str1.compareTo(str2) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

	}

}
