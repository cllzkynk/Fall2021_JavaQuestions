package repl_;

public class Repl140 {
    private String name;
    public String city;
    public String nameOfTheSchool;
    public int batchNumber;

    public void displayDetails(String name,String city,String nameOfTheSchool,int batchNumber){
        System.out.println("My name is "+name+" and I live in "+city+
                ". I study at "+nameOfTheSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        Repl140 student1=new Repl140();
        student1.displayDetails("John","Miamy","Syntax",6);

    }




}
