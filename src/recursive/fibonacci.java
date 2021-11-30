package recursive;

public class fibonacci {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		
		int adim=10;
		
		
		//fib(adim);
		
		for (int i = 0; i <=adim; i++) {
			System.out.print(fib(i)+" ");
		}
		

	}

	private static int fib(int a) {
	if(a==0) return 0;
	if(a==1) return 1;
		
	return fib(a-1)+fib(a-2);	
	}

}
