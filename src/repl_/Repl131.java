package repl_;

public class Repl131 {
    static String countryName;
    static String continent;

    public static void displayValue(){
        System.out.println(countryName+" is located on "+continent+" continent");

    }

    public static void main(String[] args) {
    countryName="Morocco";
    continent="Africa";
    Repl131.displayValue();
    }
}

