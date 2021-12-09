package practice_1;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String [] args) {
		/*
		Ask user to type a name, the length of name should be 3.
		Then check if the name has same characters. If the String has same characters 
		Print “String has duplicate characters”
		Else print “String has unique characters” use ternary 
		
		Kullanicidan bir isim isteyiniz ve isim sadece 
		3 harfli olmalidir 
		ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz
		
		e.g: ala  => 3 
		
		Test data:
		ali
		eme
		all
		charAt(0) 
*/
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a name that has 3 characters");
		String name = scan.next();
		
		
			char c1 = name.charAt(0);
			char c2 = name.charAt(1);
			char c3 = name.charAt(2);
			             // a     l     a     i     l      i
			String result = name.length()== 3 && c1 == c2 || c1 == c3 || c2 == c3? 
					"Your String has duplicate characters":"Your String has unique characters";
			
			System.out.println(result);
			
			
			
		
		
		
		
	}
}
