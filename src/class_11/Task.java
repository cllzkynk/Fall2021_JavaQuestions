package class_11;

public class Task {

	public static void main(String[] args) {
		String[][] array = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" }

		};
		System.out.println(array[0][1] + " " + array[1][0]);
		System.out.println(array[0][0] + " " + array[1][3]);
		System.out.println(array[0][2] + " " + array[1][2]);
		System.out.println(array[0][3] + " " + array[1][1]);

		System.out.println("-------------------------------------------task2------------------------------------");

		String[][] cars = { { "GMC", "Crysler" }, { "Volkswagen", "BWM" }, { "Toyota", "Sitroen" },
				{ "Fiat", "Lamborgini" }

		};

		for (int i = 0; i < cars.length; i++) {

			for (int j = 0; j < cars[i].length; j++) {

				String car = cars[i][j];
				System.out.println(car);
			}
			System.out.println();
		}

		System.out.println("_______________________________ENHANCED FOR________________________");

		for (String[] carArray : cars) {
			for (String car : carArray) {

				System.out.println(car + " ");
			}
			System.out.println();

		}
	}

}
