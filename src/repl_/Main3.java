package repl_;

public class Main3 {
    String breed;
    String name;
    String color;
    void bark() {
        System.out.println(breed + " can bark");
    }
    void run() {
        System.out.println(breed + " can run");
    }
    void play() {
        System.out.println(breed + " can play");
    }



    public static void main(String[] args) {
        Main3 Dog1= new Main3();
        Main3 Dog2=new Main3();
        Main3 Dog3=new Main3();

        Dog1.breed="Husky";
        Dog1.name="Raven";
        Dog1.color="gray";

        Dog2.breed="Bulldog";
        Dog2.name="Daisy";
        Dog2.color="Black";

        Dog3.breed="Labrador";
        Dog3.name="Donut";
        Dog3.color="Golden";

        System.out.println(Dog1.breed+" can bark");
        System.out.println(Dog1.breed+" can run");
        System.out.println(Dog1.breed+" can play");

        System.out.println(Dog2.breed+" can bark");
        System.out.println(Dog2.breed+" can run");
        System.out.println(Dog2.breed+" can play");

        System.out.println(Dog3.breed+" can bark");
        System.out.println(Dog3.breed+" can run");
        System.out.println(Dog3.breed+" can play");


        }
    }

