package repl_;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfTheClass;
    SyntaxTechnologies(){}

    SyntaxTechnologies(String schoolName,int batch,int year, String lastDayOfTheClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfTheClass = lastDayOfTheClass;
    }

    void displayInfo() {
        System.out.println(schoolName+" "+batch +" " + year + " " + lastDayOfTheClass);

    }
    public static void Main(String[] args) {
        SyntaxTechnologies1 student=new SyntaxTechnologies1();
        student.displayInfo();
        SyntaxTechnologies1 student2=new SyntaxTechnologies1("Syntax",6,2020,"07/30/2020");
        student2.displayInfo();



    }
}


