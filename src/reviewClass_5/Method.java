package reviewClass_5;

public class Method {
    String name, lastName;
    int age;
    static String SchoolName;





    public static void main(String[] args) {
        SchoolClass student1 = new SchoolClass();
        SchoolClass.SchoolName = "Harvard";
        student1.name = "John";
        student1.lastName = "Smith";
        student1.age = 23;

        SchoolClass student2 = new SchoolClass();
        student2.name = "Marta";
        student2.lastName = "Ostash";
        student2.age = 26;

        System.out.println(student1.lastName);
        System.out.println(student2.SchoolName);
        
    }


    public void study(int hour){
        System.out.println(name+""+lastName+" studies "+hour+" a day");
    }
}
