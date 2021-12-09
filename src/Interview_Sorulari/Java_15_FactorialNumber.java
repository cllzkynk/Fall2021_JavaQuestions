import java.util.stream.IntStream;

public class Java_15_FactorialNumber {

	public static void main(String[] args) {
		
		// Faktoriyel Hesaplama...
		
		// 5! = 5x4x3x2x1 =120
		// 4! = 4x3x2x1 = 24
		
		// 1. yol--for ile
		int num = 5;
		int fac = 1;
		
		for(int i = 1; i<=num; i++) {
			fac = fac * i;
			
		}
		System.out.println("factorial of "+ num + " is:" + fac );
		
		// 2. yol--Lambda ile ;
		
		System.out.println("Lambda ile : " + IntStream.rangeClosed(1, 5).reduce(1,Math::multiplyExact));
	
		
		// 3. yol--getFact(0); method ile
		
		// getFact(0); method ile
	}
	
	public static void getFact(int num) {
		
		int fac = 1;
		
		for(int i = 1; i<=num; i++) {
			fac = fac * i;
			
		}
		System.out.println("factorial of "+ num + " is:" + fac );
	}

}
