package Random_;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Oca_Interview11Question {
	/*
	 * kullanýcýnýn girdigi bir array'in en buyuk elemani ile en kucuk elemanýnýn
	 * farkýný bulan bir method create ediniz.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int elemanSayisi = 0;
		System.out.println("Gireceginiz array'in eleman sayisini giriniz : ");
		elemanSayisi = scan.nextInt();
		Integer[] arr = new Integer[elemanSayisi];
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print("Array'in " + i + ". elemanini giriniz : ");
			arr[i] = scan.nextInt();

		}

		calis(arr);
	}

	public static void calis(Integer[] arr) {
		Arrays.sort(arr);
		System.out.println("Girilen arrayin max elamenani ile min elemani farki :" + (arr[arr.length - 1] - arr[0]));
		
	}
}
