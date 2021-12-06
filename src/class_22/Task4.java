package class_22;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void info(String name, String lastName){
        System.out.println("My name is "+name+". And my last name is "+lastName);

    }
    private void info(String state, String city, int zip ){
        System.out.println("I am from "+state+","+city+","+zip);
    }
    private void info(int age){
        System.out.println("I am "+age+" years old");

    }


    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.info("Marta","Ostash");
        task4.info("NY","Brooklyn",11230);
        task4.info(26);

    }

}
