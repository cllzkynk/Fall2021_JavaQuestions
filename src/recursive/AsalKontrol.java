package recursive;

public class AsalKontrol {

	public static void main(String[] args) {
		 int n = 17;
		 
	        if (AsalMi(n, 2))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}

	private static boolean AsalMi(int n, int i) {
		if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
      
        // Check for next divisor
        return AsalMi(n, i + 1);
	}

}
