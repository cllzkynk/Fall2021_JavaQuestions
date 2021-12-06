package repl_;

public class Maaaain {
    public static void main(String[] args) {
        Employeee employeee=new Employeee();
        employeee.name="Joe";
        employeee.lastName="Smith";
        employeee.age=35;
        employeee.salary=35000;
        employeee.printProperties();

        Student student=new Student();
        student.name="Adam";
        student.lastName="Smith";
        student.age=15;
        student.grade=10;
        student.printProperties();

        Retiree retiree=new Retiree();
        retiree.name="Frank";
        retiree.lastName="Smith";
        retiree.age=15;
        retiree.seniorActivity="tour";
        retiree.printProperties();
    }





}
