package class_15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String day="Sunday";

        System.out.println(day.substring(5)+day.substring(4,5)+day.substring(3,4)+day.substring(2,3)+day.substring(1,2)+day.substring(0,1));

        System.out.println("_________ANOTHER WAY_______");
        String day1 = "Sunday";
        for (int i = day1.length()-1; i>=0; i--) {
            System.out.print(day1.charAt(i));
        }
    }
}
