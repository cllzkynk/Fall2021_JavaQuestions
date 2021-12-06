package class_17;

public class Employee {
    String empId;
    double salary;
     static String CEO="Sumair";

    public String getEmp() {
        return this.empId;
    }
    public void setEmp(String empId) {
        this.empId = empId;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Employee Id is " + this.empId +"\n" + "Employee Salary is " + this.salary+ " \n" + "CEO :" + CEO;
    }
}




