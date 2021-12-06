package repl_;

import java.util.Scanner;

public class Repl97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

        if(browser.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with Chrome Browser");
        }else if (browser.equalsIgnoreCase("FIREFOX")){
            System.out.println("Proceed with Firefox browser");
        }else if(browser.equalsIgnoreCase("ie")){
            System.out.println("Proceed with ie browser");
        }else{
            System.out.println("Invalid browser");

        }
    }
}
