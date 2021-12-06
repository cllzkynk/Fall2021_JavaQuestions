package class_15;

public class subStringMethod {
    public static void main(String[] args) {
        String name="Can u write the second m too ?";
        System.out.println(name.substring(5));
        // it will ingore everything before the index mentioned in parenthesis

        System.out.println(name.substring(6,11)+" "+name.substring(16,22));
        //prints everything that is inside these indexes, starts after 5 and includes 10;



    }
}
