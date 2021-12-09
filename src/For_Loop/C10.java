package JavaKonusalSorular.ForLoop;

public class C10 {

	public static void main(String[] args) {
		/* Soru 10
		 * 1'den 100'e kadar olan dogal sayilarin toplamini bulan bir program yaziniz...
		 * 
		 * OutPut:
		 * 
		 * Sayilarin Toplami : 5050
		 */

		int toplam = 0;

		for (int i = 0; i <= 100; i++) {

			toplam += i;
		}
		System.out.println("Sayilar Toplami : " + toplam);

	}
}
