package review_Class;

public class Casting {

	public static void main(String[] args) {

		byte byteVar = 10;
		short shortVar = 1000;
		char charVar = 'A';
		int intVar = 1000;
		long longVar = 10000;
		float floatVar = 100000;
		double doubleVar = 1000000;
		intVar = charVar;
		System.out.println(intVar);

		floatVar = (float) doubleVar;
		System.out.println(floatVar);
		byteVar = (byte) shortVar;
		System.out.println(byteVar);

		byte newVar = 100;
		short newShortVar = (short) (newVar + 10);

		int newInVar = 100;
		long newLongVar = 2147483649L;
		float floatVar1 = 145.82F;
	}
}
