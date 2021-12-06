package class_19;

public class ConstructorTask1 {
    /*
    Write a program that will have a constructor:
     one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the
     constructors 1 by 1.
     */

    int age;
    int year;
    int month;
    int date;
    String name;
    char grade;

    ConstructorTask1(){   //this is default constructor
        System.out.println("I will be called when no argumernts are passed to the constructor");
    }

    ConstructorTask1(int ageValue){   //
        age=ageValue;
        System.out.println("I will be called when 1 argumernt is passed to the constructor");
    }
          ConstructorTask1(int ageValue, String nameValue, char gradeValue) {
            age=ageValue;
            name=nameValue;
            grade=gradeValue;
              System.out.println("I will be called when 3 argumernts are passed to the constructor");
    }
    public static void main(String[] args) {
        ConstructorTask1 yes = new  ConstructorTask1(30,"Marta",'A');
        ConstructorTask1 no=new ConstructorTask1(); //java will call default (empty)constructor
        ConstructorTask1 oneValue=new ConstructorTask1(50);
    }
}
