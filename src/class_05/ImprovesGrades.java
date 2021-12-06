package class_05;

import java.util.Scanner;

public class ImprovesGrades {

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

		char grade;

		if (avg >= 90) {
			grade = 'A';

		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg > 50 && avg < 70) {
			grade = 'C';
		} else if (avg >= 40 && avg < 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is " + grade);

		// if your grade is A or B-->you are a good student,
		// you are studying a lot
		if (grade == 'A' || grade == 'B') {
			System.out.println("You're a good student");
		} else {
			System.out.println("Please, study more");
		}
	}

}
