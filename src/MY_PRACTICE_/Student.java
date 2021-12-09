package MY_PRACTICE;

public class Student {

    String name; //we're focusing on declaration,
    int age;// that's why these are local variables
    double marks;
    static int numberOfStudentsEnrolled=10;




    public void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Marks "+marks);

    }
    public void printMarks(){
        System.out.println( "Marks "+marks);
}
    public void StudentsRegistered(){
        System.out.println("Total number of Students up till now "+numberOfStudentsEnrolled);
    }
}

