package InterviewSorulari;

import java.util.stream.Stream;

public class Java_34_FibonacciForLoop {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		System.out.println(a + " "+ b + " ");
		
		for(int i = 2; i <= 10; i++) {
			int c = a+b;
			a = b;
			b = c;
			System.out.println(c+ " + ");
		}

		// Second way--2. yol Lambda ile ;
		System.out.println("");
		Stream.iterate(new int[] {0,1} , t-> new int[] {t[1],t[0]+t[1]}).limit(20).forEach(t-> System.out.print(t[0]+" "));
	}

	}


