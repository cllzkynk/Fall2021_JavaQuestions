package practice_1;

public class Casting {

	public static void main(String[] args) {

		/*
		 * ask user to enter 3 numbers then 
		 * 1- find the max number 
		 * 2- find the minimum
		 * number
		 * 
		 * 
		 */
		int n1 = 3;
		int n2 = 2;
		int n3 = 5;

		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the max number");

			if (n2 <= n3) {
				System.out.println(n2 + " is the minimum number");
			} else {
				System.out.println(n3 + " is the minimum number");
			}

		} else if (n2 >= n3 && n2 >= n1) {
			System.out.println(n2+" is the max number");
			if(n1 <= n3) {
				System.out.println(n1 +" is the minimum number");
			}else {
				System.out.println(n3 +" is the minimum number");
			}

		} else if (n3 >= n1 && n3 >= n2) {
			System.out.println(n3 + " is the max number");
			if(n1 <= n2) {
				System.out.println(n1+" is the minimum number");
			}else {
				System.out.println(n2+" is the minimum number");
			}
		}

		
		
		
		String result = n1 >= n2 &&  n1 >= n3 ? n1 +" is the max number": n2 >= n1 && n2 >= n3?
				n2+" is the max number": n3 >= n1 && n3 >= n2? n3+" is the max number" :
					" they are all equal";
		
		
		System.out.println(result);
		
	}
}
