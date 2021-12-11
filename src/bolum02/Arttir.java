package bolum02 ;

public class Arttir {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("x in artt�r metoduna g�nderilmeden �nceki de�eri " + x);
		arttir(x);
		System.out.println("x in artt�r metoduna g�nderildikten sonraki de�eri " + x);
	}

	private static void arttir(int n) {
		n ++;
		System.out.println("Artt�r metodunun i�indeki n nin de�eri " + n);
        
	}

}
