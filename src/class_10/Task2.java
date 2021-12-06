package class_10;

public class Task2 {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Julia";
		names[1] = "Mike";
		names[2] = "Maria";
		names[3] = "Asel";
		names[4] = "Marta";

		System.out.println(names[4]);

		System.out.println("______ANOTHER WAY__________");

		String[] names1 = { "Julia", "Mike", "Maria", "Asel", "Marta" };
		System.out.println(names1[4]);
	}

}
