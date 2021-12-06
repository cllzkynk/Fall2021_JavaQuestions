package class_10;

public class CoolLoop {

	public static void main(String[] args) {
		String[] cars = { "Mersedes", "BMW", "AUDI", "Toyota", "Crysler", "Honda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] + " ");

		}

		System.out.println("--------------------------getting values from array using ENHANCED FOR LOOP------------");

		/*
		 * for(type of values we have inside array+new name:name of the array)
		 * 
		 * 
		 * 
		 * 
		 */
		for (String car : cars) {// goes to elements and print it one by one, until the elements are over
			System.out.println(car + " ");

		}

		System.out.println("----------------------same-----------------------------");

		int[] numbers = { 10, 100, 90, 600, 89 };
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println("____________________________________________________________________");

		boolean[] arrayOfBoolean = { true, true, false, true };
		for (boolean boo : arrayOfBoolean) {
			System.out.print(boo + " ");
		}

	}

}
