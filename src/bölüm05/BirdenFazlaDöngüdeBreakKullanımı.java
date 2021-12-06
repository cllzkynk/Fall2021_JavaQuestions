package bölüm05;

public class BirdenFazlaDöngüdeBreakKullanýmý {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			boolean breakAll = false;
			for (int j = 0; j < 10; j++) {
				if (i * j > 50) {
					
					breakAll = true;
					break;
				}
				System.out.println("i = " + i + " j = " + j + " " + (i * j));
			}
			if (breakAll == true) {
				break;
			}

		}
	}

}
