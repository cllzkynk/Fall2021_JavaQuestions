package class_05;

public class IfWithNOBraces {

	public static void main(String[] args) {

		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("There is a Java class");// if no braces one line will be treated as code for if block

		System.out.println("Today is not Saturday");// this code does not belong to the if statement, because no braces

		System.out.println("and Tmrw I will have Java class");

		System.out.println("I'm a code outside the if statement");
	}
}
