package recursive;

public class GeriGeriYazdir {
	public static void main(String[] args) {
int sayi=15;






geriVites(sayi);
	}

	public static void geriVites(int sayi) {
		if (sayi == 0) {
			System.out.print(sayi+" ");
		} else {
			System.out.print(sayi+" ");
			geriVites(sayi - 1);
		}
	}

}
