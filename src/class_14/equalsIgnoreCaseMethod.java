package class_14;

public class equalsIgnoreCaseMethod {

	public static void main(String[] args) {
		String name1 = "Marta";
		String name2 = "MARTA";
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name2.equalsIgnoreCase(name1));
	}
}
