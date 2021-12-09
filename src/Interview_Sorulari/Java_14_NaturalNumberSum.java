import java.util.stream.IntStream;

public class Java_14_NaturalNumberSum {

	public static void main(String[] args) {
		
		
		//1+2+3+4+5...100= 5050
		// 1 den 100 kadar olan sayilarin toplami 5050 eder..
		// 1 den 50 ye kadar olan sayilarin toplamini yazdiriniz...
		
		int num = 50;
		int sum = 0;
		int sum1 = 0;
		
		// First way--1. yol
		for(int i = 1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("sum with for is: "+ sum); // 1275
		
		// Second way--2. yol
		System.out.println("-----------------------");
		
		int k = 1;
		while(k <= num) {
			sum1 = sum1+ k;
			k++;
		}
		System.out.println("sum with while is: "+ sum1); // 1275
		
		// Thirt way--3. yol
		System.out.println("-----------------------");
		
		System.out.println("lambda ile : " + IntStream.rangeClosed(1,50).sum());

	}

}
