package studentPractise;

import java.util.Scanner;

public class AdamAsmaca {

	public static void main(String args[]) {
		String kelime = "hakan";
		int i, tahmin = 0, anahtar = 0, dogru = 0;
		String eldevar[] = new String[kelime.length()];

		System.out.println("Kelimeyi bulmak için 5 yanlýþ hakkýnýz var.");
		Scanner scan = new Scanner(System.in);
		

		for (i = 0; i < kelime.length(); i++) {
			eldevar[i] = "_ ";

		}

	 while (tahmin < 6) {
		 String giris = scan.nextLine();
			System.out.println("Bir harf giriniz (Kalan hakkiniz " + (5 - tahmin) + ") : ");
			String harf = giris;
			tahmin++;
			for (i = 0; i < kelime.length(); i++) {
				if (kelime.charAt(i) == harf.charAt(0)) {
					eldevar[i] = harf + " ";
					anahtar = 1;
					dogru++;
					if (dogru == kelime.length()) {
						System.out.println("kelime " + kelime + "...Tebrikler...");
						break ;
					}
				}
			}
			if (anahtar == 1) {
				anahtar = 0;
				tahmin--;
			}
			for (i = 0; i < kelime.length(); i++) {
				System.out.print(eldevar[i]);

			}
			System.out.println();
		}
		if (dogru != kelime.length()) {
			System.out.println("Uzgunum... Dogru yanit " + kelime);
		}

	}
}