package recursive;

public class TersGit {

	public static void main(String[] args) {
		calis(9);

	}

	
		public static void calis(int i) {
		    if (i < 0) {
		      return;
		    }
		    System.out.print(i);
		    i = i - 1;
		    calis(i);
	}

}
