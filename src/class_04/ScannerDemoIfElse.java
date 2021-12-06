package class_04;

import java.util.Scanner;

public class ScannerDemoIfElse {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);//REMEMBER THIS LINE
		System.out.println("Pleaase enter boolean value for rain");
		
		Boolean Rain=input.nextBoolean();//WAITING FOR YOUR INPUT,HIT ENTER WHEN YOU"RE DONE
		if(Rain) {
			System.out.println("Take umbrella");
		}else {
			System.out.println("GO for a walk");
		}
		System.out.println("________LET'S CAPTURE INREGER VALUE________");
		
		System.out.println("Please enter your name");
		String name=input.next();
		
		System.out.println("Please enter your age");
		
		int age=input.nextInt();
	
		
		System.out.println(age);
		System.out.println("Your name is "+name+ " you're "+age+" years old ");
		
	}

}
