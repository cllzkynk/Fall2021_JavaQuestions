package bölüm07;

import java.util.Collections;

import chapter07.BinarySearch;

public class TestBinorySearch {
	public static void main(String[] args) {
		
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59,60, 66, 69, 70, 79};
		int i = BinarySearch.binarySearch(list, 2);
		int j = BinarySearch.binarySearch(list, 11);
		int k = BinarySearch.binarySearch(list, 12);
		int l = BinarySearch.binarySearch(list, 1);
		int m = BinarySearch.binarySearch(list, 3);
		
		double[] numbers = {1.2, 6, 90, 45,0.5, 8, 96, 200, 123};
		java.util.Arrays.parallelSort(numbers);
		
		for (int n = 0; n < numbers.length; n++) {
			System.out.print(numbers[n] + " ");
		}
		
	}

}
