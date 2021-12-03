package Random;

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s1 = "";
			String s2 = "";
			int count1 = 0, count2 = 0;
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				String str = sc.nextLine();
				if (i == 0) {
					s1 = str;
				}
				if (str.equals(s1)) {
					count1++;
				} else if (str.equals(s2)) {
					count2++;
				} else {
					s2 = str;
					count2++;
				}
			}
			if (count1 > count2) {
				System.out.println(s1);
			} else if (count2 > count1) {
				System.out.println(s2);
			} else {
				System.out.println("Draw");
			}

		}

	sc.close();}
}
