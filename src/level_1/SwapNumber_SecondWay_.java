/**
 * 
 */
package level_1;

/**
 * @author CELÝL
 *
 */
public class SwapNumber_SecondWay_ {

	public static void main(String[] args) {

		int a = 14;
		int b = 6;

		
		System.out.println("Before Swapping a=  "+a);
		System.out.println("Before Swapping b=  "+b);
		a = a-b;    //14-6=8
		b = a + b; // 8+6=14
		a=b-a ;   //14-8=6
		
		System.out.println("After Swapping a=  "+a);
		System.out.println("After Swapping b=  "+b);

	}

}
