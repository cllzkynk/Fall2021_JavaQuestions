package class_07;

public class DoWhileVSWhileLoop {

	public static void main(String[] args) {
		/*
		 * it also works when condition is true
		 * 
		 * -initialize a var do{ code; }while(true condition);
		 * 
		 */

		System.out.println("____________ WHILE LOOP______________");

		int a = 10;
		// first we check the condition if it's true the cycle will go on
		while (a < 15) {
			System.out.println("Hello"); // do smth
			a++;
		}

		System.out.println("____________DO WHILE LOOP_____________");

		int b = 20;
		// first to something and then check the condition
		do {
			System.out.println("HI!");
			b++;
		} while (b < 15);// then check condition

	}// even if cond is false DO WHILE will execute the code at least once

}
