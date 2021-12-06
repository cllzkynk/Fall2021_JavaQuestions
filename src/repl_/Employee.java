package repl_;

public class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;


    Employee(){

    }

    Employee(String name, String lastName,int employeeId,String startDate,
             int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;


    }
    public void printValue(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary );

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.printValue();
        Employee employee2=new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        employee2.printValue();


    }

}
