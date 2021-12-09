package com.syntax.class23;

import com.syntax.MYPRACTICE.Variables;

public class CreditCard {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    double balance, interest;
    public CreditCard(double interest) {
        this.interest = interest;
    }
    public CreditCard() {
    }
    public double getInterest(double balance) {
        return balance * interest;
    }
}
class Visa extends CreditCard {
    Visa(double interest) {
        super(interest);
    }
}
class AX extends CreditCard {
    public AX(double interest) {
        this.interest = interest;
    }
    @Override
    public double getInterest(double balance) {
        return balance * this.interest;
    }
}
class Main {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard(0.01);
        Visa obj2 = new Visa(0.01);
        AX obj3 = new AX(0.1);
        System.out.println(obj1.getInterest(5000));
        System.out.println(obj2.getInterest(5000));
        System.out.println(obj3.getInterest(5000));
    }
}