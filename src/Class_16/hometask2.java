package Class_16;

import java.util.Scanner;

public class hometask2 {

    public static char getGrade(int score){
        if(score>90 && score<=100){
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 50 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        hometask2 hometask2=new hometask2();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your score");
        int score= scan.nextInt();
        char getGrade=getGrade(score);
        System.out.println(getGrade(score));
    }
}

