package InterviewSorulari;

public class Java_04_ASCIIValueOfCharacter {

	public static void main(String[] args) {
		
		// Question: Value of ASCII of characters
		// Karakterlerin ASCII degerini yazdiriniz...
		
		char c = 'a'; 
		
		//First way--1. yol
		int ascii = c;
		System.out.println("1. yol : " + ascii); // 97
		
		
		//second way--2. yol
		int asciiNumber = (int)c;
		System.out.println("2. yol : " + asciiNumber); // 97
		
		

	}

}
