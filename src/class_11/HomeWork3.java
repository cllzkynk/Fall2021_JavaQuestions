package class_11;

public class HomeWork3 {

	public static void main(String[] args) {

		String[] countries = { "USA", "Ukraine", "Canada" };
		String[] capitals = { "DC", "Kyiv", "Ottawa" };

		for (int v = 0; v < countries.length; v++) {
			System.out.println("The capital of " + countries[v] + " is " + capitals[v]);
		}

		System.out.println("----------------------------------------------");

		String capital;
		for (String country : countries) {// countries-array, country-variable
			switch (country) {
			case "USA":
				capital = "DC";
				break;
			case "Ukraine":
				capital = "Kyiv";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			default:
				capital = "I dont know";

			}
			System.out.println("Capital of the " + country + " is " + capital);

		}

	}

}
