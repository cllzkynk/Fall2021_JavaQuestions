package bolum02;

public class OrtakHatalar {

	public static void main(String[] args) {
		int value = 2147483647 + 1;// integer ta�mas� oldu..
		System.out.println(value);

		long l = 3_000_000_000L;
		value = (int) l;// yine int ta�mas� oldu.�lk 32 bit i koydu..gerisi s��mad�
		System.out.println(value);
		
		boolean  b = 3 < 5;
		System.out.println(b);
		

	}

}
