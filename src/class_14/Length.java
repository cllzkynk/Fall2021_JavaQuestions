package class_14;

public class Length {

	public static void main(String[] args) {
		String name = new String();

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
