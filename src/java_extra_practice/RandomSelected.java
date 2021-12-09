package java_extra_practice;

import java.util.Scanner;

public class RandomSelected {

	public static void main(String[] args) {
//		
//		* Ask user to enter his/her first name, then change every letter to the next
//       *  letter. (First name should not contain the letter “Z” or “z”) If the first
//        *   name is Abc output will be Bcd
		//                           012345
		//             01234     int i=0; i<name.length();i++
		String name = "ozgur";  // length of the name is: 5
		
		//             012345         5
		for(int i = 0; i < name.length(); i++) {
			//   ozgur           01234
			char c1 = name.charAt(i);
			if(c1 != 'z' && c1 != 'Z') {
			System.out.println(++c1);
			
			}
		}
		
		
		
		
		
		
		
		
		
		/*
		for(int i=0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		*/
		
		
	}
}
