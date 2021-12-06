package class_14;

public class concatMethod {

	public static void main(String[] args) {

		String firstName = "Ebrar";
		String lastName = " Gur";
		String name = " Burju Kaya";
		String name2 = null;
		System.out.println(firstName + lastName + name2);
		assert name2 != null;
		String completeName = firstName.concat(name2);
		System.out.println(completeName);

	}

}
