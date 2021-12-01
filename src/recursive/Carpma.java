package recursive;

public class Carpma {

	public static void main(String[] args) {
		 int x = 7, y = 11;
	        System.out.println(carp(x, y));

	}

	private static int carp(int x, int y) {
		if (x < y)
            return carp(y, x);
		 else if (y != 0)
	            return (x + carp(x, y - 1));
		 else
	            return 0;
	    }

	}


