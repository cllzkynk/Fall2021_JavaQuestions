package bolum02;

public class KarakterSinifi {

	public static void main(String[] args) {
		Character ch1;
		char ch2 ='G';
		
		System.out.println(Character.isLowerCase(ch2));//Boolean olarak bize d�necek
		                                               //G b�y�k harf oldu�u i�in false d�necek
		
		char b ='D';
		System.out.println(Character.isUpperCase(b));//Boolean olarak bize true d�necek
		
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		System.out.println("isLowerCase('T') is " + Character.toLowerCase('t'));//T yi t ya �evir demek(to var)
		System.out.println("isUpperCase('Q') is " + Character.toUpperCase('a'));//Q yu A ya �evir demek(to var)
	}

}
