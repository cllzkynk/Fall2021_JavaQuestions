package class_19;

public class newStudent {
    String name;
    double subject1;
    double subject2;
    double subject3;


    newStudent(String nameValue, double subject1Value, double subject2Value, double subject3Value) { // these we take from the user
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    void printSubjectMarks(){

    }

    void printGradeAverage() {
        double avg = (subject1 + subject2 + subject3) / 3;

        System.out.println("Average marks for " + name + " is " + avg);

    }


    public static void main(String[] args) {
        Student student1 = new Student("Marta", 90, 91, 94);
        student1.printGradeAverage();
        Student student2 =new Student("Jack", 87,88,90);
        student2.printGradeAverage();
        Student student3=new Student("Maria", 78,98,94);
        student3.printGradeAverage();
        Student student4=new Student("Nabin", 58,98, 78);
        student4.printGradeAverage();

    }

}


