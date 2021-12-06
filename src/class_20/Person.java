package class_20;

public class Person {

    String name;
    String Address;
    int age;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;
    //
    Person() {
        System.out.println(" Important lines that must be executed ach time when constructor is created");
    }

    Person(String name, int age, String phone, double salary) {
        this();
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
        this.weight = 60;
        this.height = 5.4;


    }


    Person(String name, int age, String phone, double salary,String education, char martialStatus, int numberOfKid) {
        this();
        this.education = education;
        this.salary = salary;
        this.martialStatus = martialStatus;
        this.numberOfKids = numberOfKids;

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids) {
        // this(name, age, phone, salary);
        this();
        this.martialStatus = martialStatus;
        this.numberOfKids = numberOfKids;

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education, double height, double weight) {
        // this(name, age, phone, salary, martialStatus, numberOfKids, education);
        this();
        this.height = height;
        this.weight = weight;


    }

    public static void main(String[] args) {
        Person person = new Person("KhaliqYar", 33, "123456678", 0, 'M', 0, "SDET", 5.7, 68);


        Person person1 = new Person("KhaliqYar", 33, "123456678", 0);
        Person person2=new Person();

        Person person3 =new Person("Taras",31,"123456", 12,"cook",'m',0);

    }


}
