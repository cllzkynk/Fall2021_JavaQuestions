package repl_;

public class Repl111 {
    public static void main(String[] args) {
        syntaxTechnologies();
        syntaxStudents();

    }
    static void syntaxTechnologies(){
        StringBuilder stringBuilder=new StringBuilder("Welcome");
        stringBuilder.append(" Syntax Technologies!");
        System.out.println(stringBuilder);

    }
    static void syntaxStudents(){
        StringBuilder stringBuilder=new StringBuilder("Welcome");
        stringBuilder.append(" Syntax Students!");
        System.out.println(stringBuilder);
    }
}
