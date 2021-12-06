package class_10;

public class MoreArrays {

	public static void main(String[] args) {

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };// 0,1,2,3,4,5,6=grade lenght
		char secondValue = grade[1];

		String[] names = { "Julia", "Mike", "Maria", "Asel", "Marta" };
		String secondVal = names[1];

		// grade array

		for (int i = 0; i < grade.length; i++) {
			char valueFromArray = grade[i];
			System.out.println(valueFromArray);

		}

	}

}
