package bölüm07;

public class ArrayKopyalama {
	public static void main(String[] args) {
		referansKopyalamasý();
		System.out.println("--------------------");
		deðerKopyalamasý();
		
	}

	public static void deðerKopyalamasý() {
		int[] dizi1 = {8, 9, 10};
		int[] dizi2 = {11, 12, 13};
		
		System.out.println("dizi1[0] = " + dizi1[0]);
		System.out.println("dizi2[0] = " + dizi2[0]);
		
		for (int i = 0; i < 3; i++) {
			dizi2 [i] = dizi1[i];
		}
		for (int w : dizi2) {
			System.out.print(w + " ");
		}
		System.out.println();
		for (int w : dizi1) {
			System.out.print(w + " ");
		}
	}

	public static void referansKopyalamasý() {
		int[] dizi1 = {1, 2, 3};
		int[] dizi2 = {4, 5, 6};
		System.out.println("dizi1[0] = " + dizi1[0]);
		System.out.println("dizi2[0] = " + dizi2[0]);
		dizi2 = dizi1;
		
		System.out.println("dizi1[0] = " + dizi1[0]);
		System.out.println("dizi2[0] = " + dizi2[0]);
		
		dizi2[2] = 99;
		System.out.println("dizi1[2] = " + dizi1[2]);
		System.out.println("dizi2[2] = " + dizi2[2]);
	} 

}
