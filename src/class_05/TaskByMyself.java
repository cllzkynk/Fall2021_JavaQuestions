package class_05;

import java.util.Scanner;

public class TaskByMyself {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int quiz, mid, finalScore, avg;

		System.out.println("Please, enter your quiz score");
		quiz = scan.nextInt();

		System.out.println("Please, enter your mid term score");
		mid = scan.nextInt();

		System.out.println("Please, enter your final score");
		finalScore = scan.nextInt();

		avg = (quiz + mid + finalScore) / 3;
		System.out.println(avg); // the average amount of scores

		if (avg >= 90) {
			System.out.println("Grade = A");
			System.out.println("you're a good student"); // instead of printing we can initialize----> see in
															// IMPROVEDGrade

		} else if (avg >= 70 && avg < 90) {
			System.out.println("Grade = B");
			System.out.println("you're a good student");
		} else if (avg > 50 && avg < 70) {
			System.out.println("Grade = C");
			System.out.println("Please study more");
		} else if (avg >= 40 && avg < 50) {
			System.out.println("Grade = D");
			System.out.println("Please study more");

		} else {
			System.out.println("Grade = F ");
			System.out.println("Please study more");

		}
		// if your grade is A or B-->you are a good student,
		// you are studying a lot
	}

}