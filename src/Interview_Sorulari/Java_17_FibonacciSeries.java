import java.util.Scanner;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Java_17_FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Fibonacci Serisi...
		// 0 1 1 2 3 5 8 13 21 34 ....
		
		// First way--1. yol
		int a1=0;//a2
		int a2=1;//toplam
		
		for (int i = 1; i <= 13; i++) {
			System.out.print(a1+" ");
			int toplam=a1+a2;
			a1=a2;
			a2=toplam;
		}
		// Second way--2. yol Lambda ile ;
		System.out.println("");
		Stream.iterate(new int[] {0,1} , t-> new int[] {t[1],t[0]+t[1]}).limit(20).forEach(t-> System.out.print(t[0]+" "));
		}

     
	}


