package class_04;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		//learning practice only
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);//Scanner->name->new Scanner(System.in);
		//then import by putting your mouse on Scanner word;
		//shortcut to import Command+shift+o
	    //i"m adding some message to the user
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();//enables input to the console,this line waits for your inpu
		
		
		
		System.out.println("I captured value = "+value);
	
		//once you provide it HIT ENTER button
		
		
		
		//EXERCISE
		System.out.println("Plase eter your name");
		String name = scan.nextLine();		
		System.out.println("Nice to meet you "+name);
		
		
		
		
		
	}
	
	
	

}
