package bölüm06;

public class Arttýr {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("x in arttýr metoduna gönderilmeden önceki deðeri " + x);
		arttýr(x);
		System.out.println("x in arttýr metoduna gönderildikten sonraki deðeri " + x);
	}

	private static void arttýr(int n) {
		n ++;
		System.out.println("Arttýr metodunun içindeki n nin deðeri " + n);
        
	}

}
