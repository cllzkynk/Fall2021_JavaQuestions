package recursive_;

public class fibonacci {

	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		
		int adim=10;
		int onceki=1;
		int suAnki=1;
		
		//fib(adim);
		
		System.out.println("Verimsiz fib");
		
		 for (int i = 0; i <=adim; i++) { // fib fonksiyonu verimsiz bi koddur cunku hesapladiklarini tekrar hesaplamak zorunda 
			System.out.print(fib(i)+" ");
		 }
		
	
		//fib_Verimli(adim , onceki ,suAnki);
		System.out.println("\nVerimli fib_Verimli"); 
		for (int i = 0; i <=10; i++) {
			 System.out.print(fib_Verimli(i , onceki ,suAnki)+" ");  // bu kod daha verimli cunku hesapladiklarini tekrar hesaplamiyor
		}

	}

	private static int fib_Verimli(int n, int onceki, int suAnki) {
		if(n==0) return 0;
		if(n<=1) return onceki;
		return fib_Verimli(n-1 , suAnki ,onceki+suAnki);
		
	}

	private static int fib(int a) {
	if(a==0) return 0;
	if(a==1) return 1;
		
	return fib(a-1)+fib(a-2);	
	}

}
