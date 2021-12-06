package class_19;

public class Employees {


     int age;
     String name;
     char grade;
     Employees(){
         System.out.println("I will be called every time you create an obj of this class");
     }

    Employees(int numberValue, String nameValue, char characterValue){
        System.out.println("I am Initializing your fields");
        age =numberValue;
        name=nameValue;
        grade =characterValue;

    }

     void print(){
        System.out.println("Number "+ age +" name "+name+" charackter"+ grade);

    }


     //    constructor.print();
         //Constructor -name of the class
        //constructor-name of the object/variable
        //=assignment
        //new-creating new object
        //Constructor()-name of the class, which is a constructor
        //the purpose is to initialize our field;
        //THE NAME OF THE CONSTRUCTOR SHOULD BE THE SAME AS THE NAME OF CLASS



    }
