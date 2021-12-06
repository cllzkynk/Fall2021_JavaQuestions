package class_07;

public class SwitchEx {

	public static void main(String[] args) {
		String month = "March";

		// if day dec to febr -winter
		// if march-may -spring
		// so on

		switch (month) {

		case "December":
		case "January":
		case "February":

			System.out.println("It's winter");
			break;

		case "March":
		case "April":
		case "May":
			System.out.println("It's spring");

		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;

		}

	}

}
