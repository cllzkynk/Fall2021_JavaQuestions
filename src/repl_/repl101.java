package repl_;

import java.util.Scanner;

public class repl101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i = 0; i < word.length(); i+=2) {
            System.out.println(word.charAt(i));
        }
    }
}