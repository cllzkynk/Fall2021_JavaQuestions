package class_20;

public class Task3 {

    String name;
    int age;
    double salary;
    /*
   Write a program  that will have 4 different access
   levels of constructors and create 3 objects of this class:
   1 - inside same class;
   2 - from outside the class;
   3 - from different class inside different package  and observe result
   */

    private  Task3(String name){
        //we can only create obj in the same class because of the PRIVATE
            this.name=name;
        System.out.println("Private constructor is called");
    }
     Task3(int age){
        this.age=age;
         System.out.println("Default constructor is called");
    }

    public Task3(double salary){
        this.salary=salary;
        System.out.println("Public costructor is called");
    }

    public static void main(String[] args) {
        //Task3 task1=new Task3();//CE as now java will not create the default constructor
        Task3 task1=new Task3("Marta");
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task3 task2=new Task3(12);
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);

        Task3 task3=new Task3(12.6);
        System.out.println(task1.name);
        System.out.println(task1.age);
        System.out.println(task1.salary);


    }

}
