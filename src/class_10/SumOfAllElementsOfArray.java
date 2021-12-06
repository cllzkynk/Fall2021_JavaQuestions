package class_10;

public class SumOfAllElementsOfArray {

	public static void main(String[] args) {
		System.out.println("______________TASK1_______________");
		int[] num = new int[3];

		num[0] = 10;
		num[1] = 20;
		num[2] = 15;

		int sum = num[0] + num[1] + num[2];
		System.out.println(sum);

		System.out.println("______________TASK2_______________");

		String[] animals = { "Lion", "Tiger", "Elephant", "Cat" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i] + " ");

			System.out.println("_______another way ENHANCED FOR LOOP________");

		}
		for (String animalName : animals) { // on the right size it should be the name of array
			System.out.println(animalName + " ");
		}

	}
}