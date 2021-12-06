package class_15;

public class ReplaceAllMethod {
    public static void main(String[] args) {

        //we use it when we want to replace all the patterns in methods,not only characters


        String mix="3213Hello 89 World354545 *&***^&*^&*";
        //System.out.println(mix.replaceAll("[0-9]", ""));//it will replace all the numbers
        //System.out.println(mix.replaceAll("[a-z]", ""));// will replace all the lowercase letters
        //System.out.println(mix.replaceAll("[a-z A-Z]", "")); //will replace all the letters
        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));//will replace all but special characters



        String name="Marta Ostash1234**&^$#5";
        System.out.println(name.replaceAll("[^A-Za-z0-9]", ""));

    }
}