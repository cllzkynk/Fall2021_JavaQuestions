package InterviewSorulari;

import java.util.Scanner;

public class Java_26_PowerConcept {

	public static void main(String[] args) {
		
		//3^4 = 81

        Scanner klavye=new Scanner(System.in);
        System.out.println("a üzeri b gibi bir hesaplama için a değerini yazınız:");
        int a=klavye.nextInt();

        System.out.println("a üzeri b gibi bir hesaplama için b değerini yazınız:");
        int b=klavye.nextInt();


        //işlem: b kere a'yı kendisi ile çarpacağız
        int carpim=1;
        for (int i=1; i<=b; i++)
            carpim=carpim*a;

        System.out.println("a üzeri b="+carpim);

        System.out.println("~~~~~~~~~~~~~");

        // 2. yol
		
		int base = 3;
		int exponent = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
        
    }

}
