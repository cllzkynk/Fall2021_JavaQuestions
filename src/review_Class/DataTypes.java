package review_Class;

public class DataTypes {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;

		System.out.println(number1 * number2);// 30

		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);// 1020 btw we cannot *Strings

		String name = "syntax";
		// using long is a waste of memory

		float floatNumber = 100030000004459554f;// after 5-6digits float won't print it;
		System.out.println(floatNumber);

		double d = 111111111527465265146.4;// double keeps up to 15 decimal numbers
		System.out.println(d);

		char ch = 'C';
		System.out.println(ch);

		boolean boo = true;
		System.out.println(boo);

		System.out.println();
		double bonus = 0.08;
		int employee1 = 1020000;
		int employee2 = 130000;
		int employee3 = 140000;
		double bonusForEmployee1 = employee1 + bonus;
		double bonusForEmployee2 = employee2 + bonus;
		double bonusForEmployee3 = employee3 + bonus;
		System.out.println(bonusForEmployee1);

		double pi = 3.146756636376367836;

	}

}
