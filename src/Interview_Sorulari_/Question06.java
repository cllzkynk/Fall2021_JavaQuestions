package Interview_Sorulari_;

import java.util.Arrays;

import java.util.Scanner;

public class Question06 {
	/*
	 * kullanicidan iiki string aliniz Stringlerim karakterleri ayni ise "Anagram"
	 * degil ise anagram degil yazdirin. ornek; "Mary" and "army" and "RAMY" are
	 * Anagrams.
	 */

	public static void main(String[] args) {
		/*
		 * kullanicidan iiki string aliniz Stringlerim karakterleri ayni ise "Anagram"
		 * degil ise anagram degil yazdirin. ornek; "Mary" and "army" and "RAMY" are
		 * Anagrams.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki String girinz");
		String first = scan.nextLine().toLowerCase(), second = scan.nextLine().toLowerCase();

	 
		System.out.println(isAnagram(first, second) ? "Anagram" : "Anagram Degil");

		scan.close();
	}

	public static boolean isAnagram(String s1, String s2) {

		String first[] = s1.split("");
		Arrays.sort(first);
		System.out.println("First "+Arrays.toString(first));
		String second[] = s2.split("");
		Arrays.sort(second);
		System.out.println("Second"+Arrays.toString(second));
		return Arrays.equals(first, second);

	}
}
