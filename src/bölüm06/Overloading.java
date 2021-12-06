package bölüm06;

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
	
	public static int max(int sayı1,int sayı2) {
		return (sayı1 > sayı2) ? sayı1 : sayı2;
		
		
	}
	
	public static double max(double sayı1,double sayı2) {
		double max;
		
		if (sayı1 > sayı2) {
			max = sayı1;
		}else {
			max = sayı2;
		}
		//Alternatif
		//max = (sayı1 > sayı2) ? sayı1 : sayı2;
		return max;
		
	}

}
