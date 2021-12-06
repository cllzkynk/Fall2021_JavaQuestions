package class_10;

public class AnotherWAyArrays {

	public static void main(String[] args) {

		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya" };

		// we cannot add more names separately

		System.out.println(names[3]); // we have an array with 5 elements,

		// how do I know how many elements I have in the array?

		int size = names.length;
		System.out.println("Size of names array = " + size);

		System.out.println(names[names.length - 2]); // names.length=5//6-2=3//3=Bryan

		int a = 2;
		System.out.println(names[a]);// Jack

		a += 2;
		System.out.println(names[a]); // Bryan cause i was2, and we're adding 2more

		System.out.println("----------------------LOOP------------------------------");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("_______________________________________________");

		for (int i = 0; i <= names.length - 1; i++) {// -1 (length-6, highest index=5;)

		}

	}
}
