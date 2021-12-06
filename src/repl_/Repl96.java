package repl_;

import java.util.Scanner;

public class Repl96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();
        switch (language){
            case"Java":
                System.out.println(language+" is a programming language");
                break;

            case"C":
                System.out.println(language+" is a programming language");
                break;

            case"C++":
                System.out.println(language+" is a programming language");
                break;

            default:
                System.out.println("Doesn't match any programming language");

            }
        }


}

