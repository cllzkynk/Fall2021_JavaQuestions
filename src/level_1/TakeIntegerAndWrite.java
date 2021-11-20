package level_1;

import java.util.Scanner;

public class TakeIntegerAndWrite {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		System.out.println("You entered : "+num);
scan.close();
	}

}
