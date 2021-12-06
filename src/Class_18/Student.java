package Class_18;

public class Student {
     String studentName;
     String studentID;
     static int numberOfStudents;

    public static void main(String[] args) {

        Student student1=new Student();
        student1.studentName="Marta";
        student1.studentID="197390";
        Student.numberOfStudents++;
        System.out.println(student1.studentID);
        System.out.println(student1.studentName);
        System.out.println(Student.numberOfStudents);

        Student student2=new Student();
        student2.studentName="Taras";
        student2.studentID="567";
        Student.numberOfStudents++;
        System.out.println(student2.studentID);
        System.out.println(student2.studentName);
        System.out.println(Student.numberOfStudents);





    }

}
