package class_04;

public class NestedIF {
	// if(boolean) {
	// code
	// if() {
	// }
	// }else{
	public static void main(String[] args) {
		/*
		 * variable for allergy-yes/no
		 * 
		 * if yes---> we will check if pet, if peanut and if pollen
		 * 
		 * no---> you're lucky
		 */
		boolean allergy = true;

		boolean petAllergy = false;

		if (allergy) {
			System.out.println("Let's do futher check");

			if (petAllergy) {
				System.out.println("please, no cats or dogs in the house");
			} else {
				System.out.println("That is good");
			}
		} else {
			System.out.println("You're lucky");
		}
		System.out.println("_______________________________________");

		/*
		 * if today is Friday-I'll watch the movie but would like to check the date if
		 * 13--->watch scary if not--> comedy ifno friday-studying
		 */

		boolean isFriday = true;
		int date = 14;
		boolean monday = true;

		if (isFriday) {

			if (date == 13) {
				System.out.println("We will watch scary movie");
			} else {
				System.out.println("I will watch a comedy");
			}
		} else {

		}
		if (monday) {
			System.out.println("I'm not studying I am working");
		} else {
			System.out.println("I have class at syntax");
		}

		System.out.println("-----------------");

		/*
		 * check if assignment is completed if yes I'll check your score: if score
		 * >90--->great job if score > 80 ---> good job if score >70--->please study
		 * more
		 * 
		 */
		int score = 65;
		boolean assignment = false;

		if (assignment) {

			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Good job");
			} else if (score > 70) {
				System.out.println("Probably u need to study more");
			} else {
				System.out.println("Good job for trying but you must study more");

			}

		} else {
			System.out.println("u should complete all assignments");
		}

	}

}
