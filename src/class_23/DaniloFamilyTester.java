package com.syntax.class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {


        DaniloParents daniloParents = new DaniloParents();

        Danilo danilo = new Danilo();

        Jelena jelena = new Jelena();
        Milos milos = new Milos();
        milos.run();

        DaniloParents[] familyArray = new DaniloParents[3];
        familyArray[0] = new Danilo();
        familyArray[1] = new Jelena();
        familyArray[2] = new Milos();

        //traditional approach
        print(danilo, jelena, milos);
        //advance polymorphism approach
        System.out.println("--------------------------------");
        print(familyArray);


    }


    public static void print(Danilo danilo, Jelena jelena, Milos milos) {
        danilo.eat();
        danilo.sleep();

        jelena.eat();
        jelena.sleep();

        milos.eat();
        milos.sleep();

    }

    public static void print(DaniloParents[] daniloParent) {
        for (DaniloParents dp : daniloParent
        ) {
            dp.eat();
            dp.sleep();

        }

    }
}
