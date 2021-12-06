package repl_;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

        int i=0;
        int j=givenString.length()-1;
        while(i<j){

            if(givenString.charAt(i)!=givenString.charAt(j)){
                System.out.println("false");
                return;
            }
            i++;
            j--;
        }
        System.out.println("true");



    }
}
