package MY_PRACTICE;

public class MainForVariables {
    public static void main(String[] args) {

        Variables variables=new Variables();

        variables.varsDemo();
        variables.varsDemo1();


        Student marta=new Student();
        marta.name="Marta";
        marta.age=26;
        marta.marks=90;
        Student.numberOfStudentsEnrolled++;
        marta.StudentsRegistered();


        Student taras=new Student();
        taras.name="Taras";
        taras.age=31;
        taras.marks=95;
        Student.numberOfStudentsEnrolled++;
        taras.StudentsRegistered();


         Student mary=new Student();
        mary.name="Mary";
        mary.age=20;
        mary.marks=88;
        Student.numberOfStudentsEnrolled++;
        mary.StudentsRegistered();

    }

}
