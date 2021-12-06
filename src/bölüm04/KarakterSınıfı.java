package bölüm04;

public class KarakterSýnýfý {

	public static void main(String[] args) {
		Character ch1;
		char ch2 ='G';
		
		System.out.println(Character.isLowerCase(ch2));//Boolean olarak bize dönecek
		                                               //G büyük harf olduðu için false dönecek
		
		char b ='D';
		System.out.println(Character.isUpperCase(b));//Boolean olarak bize true dönecek
		
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));
		System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));
		System.out.println("isLowerCase('T') is " + Character.toLowerCase('t'));//T yi t ya çevir demek(to var)
		System.out.println("isUpperCase('Q') is " + Character.toUpperCase('a'));//Q yu A ya çevir demek(to var)
	}

}
