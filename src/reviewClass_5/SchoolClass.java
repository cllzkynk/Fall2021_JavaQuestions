package reviewClass_5;

public class SchoolClass {
    //instance  variables -inside the class but outside the method,the values are different
    //local var-
    //static var

    String name, lastName;
    int age;
    static String SchoolName;





    public static void main(String[] args) {
        SchoolClass student1=new SchoolClass();
        SchoolClass.SchoolName="Harvard";
        student1.name="John";
        student1.lastName="Smith";
        student1.age=23;

        SchoolClass student2=new SchoolClass();
        student2.name="Marta";
        student2.lastName="Ostash";
        student2.age=26;

        System.out.println(student1.lastName);
        System.out.println(student2.SchoolName);
    }







}
