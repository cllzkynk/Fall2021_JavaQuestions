package bolum02 ;

public class Ambiguous {//Hangi metodu �a��raca��n� bilememsi durumudur
	public static void main(String[] args) {
		max(3, 3.7);//max(2, 5) yaz�lsa hata al��z.Hangi metodu �a��raca��n� bilemiyor
	}

	public static double max(int num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static double max(double num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

}
