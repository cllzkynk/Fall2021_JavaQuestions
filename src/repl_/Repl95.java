package repl_;

import java.util.Scanner;

public class Repl95 {
    public static void main(String[] args) {
        String word;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter any word");
        word=scan.nextLine();

        System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));





    }
}