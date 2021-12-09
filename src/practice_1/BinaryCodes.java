package practice_1;

public class BinaryCodes {
public static void main(String[] args) {
	/*
	Binary number is a number expressed in the base-2 numeral system or
	binary numeral system, which uses only two symbols: typically 0 (zero) 
	and 1 (one). Each digit is referred to as a bit.
	Given an int variable decimal,  write java program to calculate binary value of 
	the decimal variable and assign it binary array. print out value of binary 
	array matching below format. Feel free to use additional arrays or formulas.
	Example:
	decimal -> 3
	binary -> [0, 0, 0, 0, 0, 0, 1, 1]

	decimal -> 35
	binary -> [0, 0, 1, 0, 0, 0, 1, 1]

	decimal -> 255
	binary -> [1, 1, 1, 1, 1, 1, 1, 1]

*/
	int sum = 0;
	int j = 2;  //     16 8 0 2 1 
	int [] arr = {0,0,0,1,1,0,1,1};
	for(int i=arr.length-1; i  >= 0; i--) {
		sum += arr[i]*j;
		j = j * 2;
		
	}
     System.out.println(sum/2);
}
}
