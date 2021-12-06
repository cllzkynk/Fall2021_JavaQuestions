package homework2;

public class hw05 {

	public static void main(String[] args) {
		
		//Write a method that returns the sum of the digits of the entered number.

		
		
			System.out.println("The Sum of the Digits of the Number:" +digitSum(6576));
		}
		
		public static int digitSum(int n) {
			int sum = 0;
			while(n>0) {
			int remain=n%10;
			sum= sum+remain;
			n/=10;
			}return sum;
	}
	
}
