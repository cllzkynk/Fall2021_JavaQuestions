package homework2;

public class hw04 {

	public static void main(String[] args) {
		// Write down the number that finds the largest number among 3 numbers.
		
			theBiggest(-5,-5,-3);
		}

		public static void theBiggest(double a, double b, double c) {
		if(a>b && a>c) {
			System.out.println("The Biggest: " + a);
		}
		else if(b>c && b>a) {
			System.out.println("The Biggest:" + b);
		}
		else if(c>a && c>b) {
			System.out.println("The Biggest:" +c);
		}
		else {
			System.out.println("Invalid");
		}
		
		}

	}


