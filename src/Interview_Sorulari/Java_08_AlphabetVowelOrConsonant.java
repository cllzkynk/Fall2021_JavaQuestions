package InterviewSorulari;

public class Java_08_AlphabetVowelOrConsonant {

	public static void main(String[] args) {
		
      // Question: Check whether an alphabet is Vowel or Consonant
	  // Bir alfabenin unlu veya unsuz olup olmadigini kontrol edin
	  // a e i o u
		
		char ch = 'c';
		
		
		//First way--1. yol
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel(unlu)");
		}
		else {
			System.out.println(ch + " is consonant(unsuz)");
		}
		
		//Second way--2. yol
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel(unlu)");
			break;

		default:
			System.out.println(ch + " is consonant(unsuz)");
			break;
		}

	}

}
