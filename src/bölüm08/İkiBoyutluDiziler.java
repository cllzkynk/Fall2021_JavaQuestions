package bölüm08;

public class ÝkiBoyutluDiziler {
	public static void main(String[] args) {
		int[][] volkan = null;
		System.out.println(volkan);

		volkan = new int[5][5];
		volkan[2][2] = 7;

		for (int i = 0; i < volkan.length; i++) {
			for (int j = 0; j < volkan[i].length; j++) {
				System.out.print(volkan[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] x = new int[3][];//Aþaðýdaki ile volkanýn ikinsi parametrelerini tanýmlýyoruz
		x[0] = new int[4];
		x[1] = x[0];
		x[2] = x[0];
		x[2][2] = 5;
		System.out.println(x[1][2]);
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		
		}
		
		
		
	}		
	

}
