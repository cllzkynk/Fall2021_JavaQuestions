package reviewClass_5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Create a String[] and convert it to char[][]
        Scanner scan=new Scanner(System.in);
        String[] strArr=new String[3];
        for(int i=0; i<strArr.length; i++) {
            System.out.println("Enter a word :");
            strArr[i]=scan.next();
        }
        char[][] charArr = new char[strArr.length][];
        for(int i=0; i<strArr.length; i++) {
            charArr[i]=strArr[i].toCharArray();
        }
        for(char[] chr:charArr) {
            for(char c:chr) {
                System.out.print(c+"   ");
            }
            System.out.println();
        }
        System.out.println(charArr[2][4]);
        scan.close();
    }
}



