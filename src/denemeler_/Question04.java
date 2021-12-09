package day02;

import java.util.Scanner;

//ask user to enter an e-mail address
// then if it contains "hotmail" replace it with "gmail"
// e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

public class Question04 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email giriniz");
		String email = scan.next();
		
		if(email.contains("hotmail")){
			email = email.replace("hotmail", "gmail");
		}
		System.out.println(email);
		
		
	}
}