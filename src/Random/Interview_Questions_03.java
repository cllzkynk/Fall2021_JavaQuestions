/**
 * 
 */
package Random;

import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Interview_Questions_03 {

	/*
	 * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
	 * tek saydiran java code create ediniz.
	 * 
	 * For Example: Input : String is "Ali came to school and Ayse came to school"
	 * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		String tekler[] = tekle(arr).split(" "); // artik her helimeden elimde bir tane var en son yazarken kullanmak
													// icin
		// System.out.println(tekle(arr)); //kelimelerin yekligini gordum.

		adetSay(arr, tekler);
		// System.out.println(Arrays.toString(adetSay(arr, tekler)));// tekli
		// arrayimizdeki herbir kelimeyi asil arrayde
		// kac tane diye saydik ve o sayilari tekli
		// arraydeki kelimelerle concat ettik

		// soru bizden array olarak istemiyor String olarak yaz diyor
		for (int i = 0; i < tekler.length - 1; i++) {
			System.out.print(tekler[i] + ", ");
		}
		System.out.println(tekler[tekler.length - 1]);
		scan.close();
	}

	public static String[] adetSay(String[] arr, String tekler[]) {
		int count = 0;
		for (int i = 0; i < tekler.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (tekler[i].equals(arr[j])) {
					count++;
				}
			}
			tekler[i] += "=" + count;
			count = 0;
		}

		return tekler;
	}

	public static String tekle(String[] arr) {
		String tekler = "";
		for (int i = 0; i < arr.length; i++) {
			if (!tekler.contains(arr[i])) {
				tekler += arr[i] + " ";
			}
		}

		return tekler;

	}
}