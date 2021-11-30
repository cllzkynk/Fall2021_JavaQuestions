package studentPractiseSelected;

import java.util.Arrays;

public class FibonacciWhitArray {
public static void main(String[] args) {
	int n ,i ;
	
	int kaceleman=10;
	int arr []=new int [kaceleman];

	arr[0]=0;
	arr[1]=1;
	for ( i = 2; i < arr.length; i++) {
		arr[i]=arr[i-1]+arr[i-2];
	}
	System.out.println(Arrays.toString(arr));
}
}
