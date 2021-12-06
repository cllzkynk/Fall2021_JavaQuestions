package repl_;

public class Repl123 {
    int year;
    String schoolName;
    int batchNumber;

    void printInfo(){
        System.out.println("I am a student of batch "+batchNumber+
                " studying at "+schoolName+" in the year of "+year);

    }



    public static void main(String[] args) {
        Repl123 repl123=new Repl123();
        repl123.year=2020;
        repl123.schoolName="Syntax";
        repl123.batchNumber=6;
        repl123.printInfo();
    }
}
