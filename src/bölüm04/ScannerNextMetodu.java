package bölüm04;

import java.util.Scanner;

public class ScannerNextMetodu {

	public static void main(String[] args) {
		
		Scanner java = new Scanner(System.in);
		System.out.println("Enter three words seperated by spaces");
		String s1 = java.next();
		String s2 = java.next();
		String s3 = java.next();
		
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		System.out.println("s3 is " + s3);
        java.nextLine();//Þuan önceki girdiklerimiz temizlendi
		
		System.out.println("Enter a line");
		String s = java.nextLine();
		System.out.println("the line entered is " + s);

	}

}
