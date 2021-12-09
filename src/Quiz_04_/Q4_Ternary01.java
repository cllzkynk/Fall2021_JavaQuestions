package Quiz.Quiz_04;

public class Q4_Ternary01 {

	public static void main(String[] args) {
		
		
		// Soru  1 
		
		int t=112; 
		System.out.println((t>5) ? ("Inek") : ("Koyun"));

		// Soru 2 
		
		int k=112;
		System.out.println(( k < 9) ? 9:11);

		// Soru 3 
		
		int y=1;
		int z=1;
		int a = y<10 ? y++ : z++;
		System.out.println(y + "," + z + "," + a);

	}

}
