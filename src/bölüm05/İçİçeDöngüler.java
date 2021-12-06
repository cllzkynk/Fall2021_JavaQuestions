package bölüm05;

public class ÝçÝçeDöngüler {

	public static void main(String[] args) {
		int sayac = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					sayac++;
					System.out.println("sayac: " + sayac + " i: " + i + " j: " + j + " k: " + k);
				}
			}
		}

	}

}
