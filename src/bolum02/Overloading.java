package bolum02�l�m02;

public class Overloading {
	public static void main(String[] args) {
		double d1 = 5.67;
		double d2 = 23.99;
		
		double max = max(d1, d2);
		System.out.println(max);
		
		int m = max(5, 89);
		System.out.println(m);
		
		System.out.println(max(2, 5.89, 6));
	}
	public static double max(double num1, double num2, double num3) {
		return max(max(num1,num2),num3);
	}
	
	public static int max(int say�1,int say�2) {
		return (say�1 > say�2) ? say�1 : say�2;
		
		
	}
	
	public static double max(double say�1,double say�2) {
		double max;
		
		if (say�1 > say�2) {
			max = say�1;
		}else {
			max = say�2;
		}
		//Alternatif
		//max = (say�1 > say�2) ? say�1 : say�2;
		return max;
		
	}

}
