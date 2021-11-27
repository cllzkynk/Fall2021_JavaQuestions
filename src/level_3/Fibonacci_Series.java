/**
 * 
 */
package level_3;

/**
 * @author CELÝL
 *
 */
public class Fibonacci_Series {
public static void main(String[] args) {
		int num=27; // ilk kac terimi istedigimiz 
		int t1=0;
		int t2=1;
		
		for (int i = 1; i <=num; i++) {
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}

	}

}
