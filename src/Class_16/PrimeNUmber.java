package Class_16;

public class PrimeNUmber {
    boolean isPrime(int number) {
        if(number<=1){
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <=number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
                 break;
            }

        }
         return isPrime;
    }
}
