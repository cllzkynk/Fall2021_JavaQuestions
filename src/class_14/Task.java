package class_14;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		String userName;
		String password;
		String confirmedPassword;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		userName = scan.next();

		System.out.println("Please, enter your password");
		password = scan.next();

		System.out.println("Please confirm your password");
		confirmedPassword = scan.next();

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");

		} else{
			if (password.length() < 8) {
			System.out.println("Password is too short");
		} else{
				if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else {
					if (!(confirmedPassword.equals(password))) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}
	}
}
}}}