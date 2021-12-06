package class_06;

import java.util.Scanner;

public class CountriesLanguage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the country you are from");
		String country = scan.nextLine();
		String lang;

		switch (country) {

		case ("Ukraine"):
			lang = "Ukrainian";
			break;

		case ("USA"):
			lang = "American";
			break;

		case ("Turkey"):
			lang = "Turkish";
			break;

		case ("Spain"):
			lang = "Spanish";
			break;

		default:
			lang = "Invalid";

		}
		System.out.println("You speak " + lang);
	}

}
