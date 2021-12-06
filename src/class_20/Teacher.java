package class_20;

public class Teacher {
    String name;
    int experience;
    double salary;
    String degree;
    String education;
    String subject;

    Teacher(String name, int experience, String degree, String subject) {
        this.name = name;
        this.experience = experience;
        this.degree = degree;
        this.subject = subject;
    }

    Teacher(String name, int experience, String degree, String subject, double salary, String education) {
        this(name, experience, degree, subject);
        this.salary = salary;
        this.education = education;
    }

    public Teacher() {
    }

    void print() {
        System.out.println("The teacher " + name + " has " + experience + " years experience of teaching and " + degree + " degree");
    }

}



