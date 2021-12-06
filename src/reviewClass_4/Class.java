package reviewClass_4;

public class Class {

	public static void main(String[] args) {

		String name = "Marta";

		int length = name.length();
		name = "Marta Ostash";
		System.out.println(name.length());
		name = "Marta     ";
		System.out.println(name.length());

		if (name.length() > 10) {
			System.out.println("You're great");
		}

	}
}