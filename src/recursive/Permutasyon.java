package recursive;

public class Permutasyon {
	static int level = -1;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i, N = 3;
	    int perm[] = new int[N];
	    permutasyon(perm, N, 0);

	}

	private static void permutasyon(int[] perm, int N, int k) {
		level = level + 1;
	    perm[k] = level;
	 
	    if (level == N)
	        print(perm, N);
	    else
	        for (int i = 0; i < N; i++) {
	 
	            
	            if (perm[i] == 0) {
	            	permutasyon(perm, N, i);} }
	 
	    level = level - 1;
	     
	    perm[k] = 0;
		
	}

	private static void print(int[] perm, int N) {
		 for (int i = 0; i < N; i++)
		        System.out.print(" " + perm[i]);
		    System.out.println();
		
	}

}
