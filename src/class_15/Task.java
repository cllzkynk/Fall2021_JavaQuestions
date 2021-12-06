package class_15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        String dadsFirstName,momsFirstName,gender,babyName;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter mom's first name");
        momsFirstName= scan.nextLine();

        System.out.println("Pease, enter Dad's first name");
         dadsFirstName=scan.nextLine();

        System.out.println("Boy or girl?");
        gender=scan.nextLine();

        if(gender.toLowerCase().startsWith("b")){
            String firstPart=dadsFirstName.substring(0, dadsFirstName.length()/2);
            String lastPart=momsFirstName.substring(momsFirstName.length()/2);
            babyName=firstPart+lastPart;

        }else if(gender.toLowerCase().startsWith("g")) {
            String firstPart=momsFirstName.substring(0, momsFirstName.length()/2);
            String lastPart=dadsFirstName.substring(dadsFirstName.length()/2);
            babyName=firstPart+lastPart;
        }else{
            babyName="No suggestions";
        }

        System.out.println(babyName);
    }



}
