/**
 * 
 */
package Random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author CELÝL
 */
public class Interview_Questions_06 {

	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Gir bisiler");
		String str = scan.nextLine();

		String[] arr = str.split("");

		System.out.println(tekle(arr));

		adetYaz(str,  arr );
		
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
			dt.plusDays(30);
			dt.plusMonths(1);
			System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	}	

	private static void adetYaz(String str, String[] arr) {
		List<String> tekrarlar = new ArrayList<>();
		System.out.println("\nGirilen Ifadede :  ");
		for (int i = 0; i < tekle(arr).length(); i++) {
			int sayac = 0;
			for (int j = 0; j < str.length(); j++) {
				if (tekle(arr).charAt(i) == str.charAt(j)) {
					sayac++;
				}

			}
			if (sayac>1) {
				tekrarlar.add(tekle(arr).charAt(i)+"");
				}

			if (tekle(arr).charAt(i) == ' ') {
				System.out.println("==>" + tekle(arr).charAt(i) + " " + sayac + " defa " + " (bosluk) ");
			} else {
				System.out.println("==>" + tekle(arr).charAt(i) + " " + sayac + " defa ");
			}
		}
		System.out.println("\nTekrarlaniyor");

		System.out.println("\nTekrarlananlar ===> " + tekrarlar);
	}

	public static String tekle(String[] arr) {
		String tekharfler = "";
		for (int i = 0; i < arr.length; i++) {
			if (!tekharfler.contains(arr[i]))
				tekharfler += arr[i];
		}

		return tekharfler;
	}
}
