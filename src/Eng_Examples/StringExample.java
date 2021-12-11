package Eng_Examples;

public class StringExample {

	public static void main(String[] args) {
		
		//String is non primitive type
		String variable="Hello";
		String mySentence="Today is Sunday, September 27";
		
		System.out.println(mySentence);
		
		//int number"99"; error because anything we put in "" -->becomes a string!!!
		
		String number="99";//we will get 99 as a String
		
		//String=100; it's not a string cause no ""
		System.out.println(number);
		
		//char c="C"; error cause it's in "" and it means it's not a char but string
		String oneLetter="Y";		
		System.out.println(oneLetter);
				
		
	}

}
