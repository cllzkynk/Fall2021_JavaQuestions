package b�l�m06;

public class AsalSay�Yazd�rMetod {
	public static void main(String[] args) {
		int asalSay�Sayac� = 0;
		int say� = 2;
		while (asalSay�Sayac� < 1000) {
			if (asalM�(say�)) {
				System.out.printf("%5d",say�);//%4d nin manas� say�y� 4 basamak i�inde yazakt�r demek.
				asalSay�Sayac�++;
				if (asalSay�Sayac� % 10 == 0) {
					System.out.println();
				}
			}
			say�++;
		}
	}

	private static boolean asalM�(int say�) {

		for (int i = 2; i < say�; i++) {
			if (say� % i == 0) {
				return false;
			}

		}
		return true;
	}
}