package class_17;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Employee obj2=new Employee();
            Employee emp1 = new Employee();
            Employee emp2 = new Employee();
            emp1.setEmp(" 678");
            emp1.setSalary(56789.00);

            emp2.setEmp(" 34455");
            emp2.setSalary(991802.00);

            printInfo(emp1);

            System.out.println("-----------------------------------");
            printInfo(emp2);
        }
        public static void printInfo(Employee emp) {
            System.out.println(emp.toString());


    }
}
