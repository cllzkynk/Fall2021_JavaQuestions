package class_14;

public class equalsMethod {
	public static void main(String[] args) {
		String name = "Marta";
		String name2 = "Marta";
		String name3 = "Taras";

		name = new String("Marta");
		name2 = new String("Marta");
		name3 = new String("Taras");

		System.out.println(name.equals(name2));
		System.out.println(name2.equals(name3));
		System.out.println(name.equals(name3));

	}

}
