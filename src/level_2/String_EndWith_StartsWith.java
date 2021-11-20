package level_2;

public class String_EndWith_StartsWith {

	public static void main(String[] args) {
		String str = "Insanlar yalnýzca yaþamýn amacýnýn mutluluk olmadýðýný düþünmeye baþlayýnca mutluluða ulaþabilirler";

		/* 1 */ boolean endWithChar = str.endsWith("r");// true

		/* 2 */ boolean endWithChar2 = str.endsWith("R"); // false

		/* 3 */ boolean endWithText = str.endsWith("bilirler");// true

		/* 4 */ boolean endWithText2 = str.endsWith("bilirdi"); // false

		/* 5 */ boolean startsWithChar = str.startsWith("I");// true

		/* 6 */ boolean startsWithChar2 = str.startsWith("K"); // false

		/* 7 */ boolean startsWithText = str.startsWith("Insan");// true

		/* 8 */ boolean startsWithText2 = str.startsWith("People"); // false

		System.out.println("1==>" + endWithChar + "\n2==>" + endWithChar2 + "\n3==>" + endWithText + "\n4==>"
				+ endWithText2 + "\n5==>" + startsWithChar + "\n6==>" + startsWithChar2 + "\n7==>" + startsWithText
				+ "\n7==>" + startsWithText2);

	
		
	}

}
