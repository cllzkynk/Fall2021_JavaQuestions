package InterviewSorulari;

public class Java_30_FactorNumbers {

    static int number = 66;

	public static void main(String[] args) {

            // FactorNumbers
            //carpanlarini bulma

            yol1();//for

            yol2();// while

            yol3();//sayi negatifse
        }

        private static void yol3() {

            int num=-60;

            System.out.print("\nFactors of " + number + " are: ");
            // dongumuz -60 ile +60 arasinda olmali
            // o yuzden donguyu 1 den degil -60 dan baslatmaliyiz

            for (int i = num; i < Math.abs(num); i++) {//abs mutlak degerini alir
                try {
                    if (num%i==0) {// i= -60 -59 ... 0 1 2 ... 60
                        System.out.print(i + " ");
                    }
                } catch (ArithmeticException e) {//0 ile bolumunde ArithmeticException/by zero
                    //hatasi verir.
                    continue;
                }
			/*
			  if(i == 0) {
        		continue;
      		  }
		      else {
		        if (number % i == 0) {
		          System.out.print(i + " ");
		        }
			 */
            }

        }

        private static void yol2() {
            int i=1;
            System.out.print("\nFactors of " + number + " are: ");
            while(i<=number) {
                if(number % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }


        }

        private static void yol1() { // poztif bolenleri

            //static int number = 66;
            System.out.print("Factors of " + number + " are: ");
            for(int i = 1; i <= number; ++i) { // 1 2 5
                if (number % i == 0) {
                    System.out.print(i + " "); //1 2
                }
            }

        }

    }
