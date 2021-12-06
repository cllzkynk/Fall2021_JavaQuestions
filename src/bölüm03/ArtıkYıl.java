package bölüm03;

import java.util.Scanner;

public class ArtýkYýl {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen bir yýl giriniz");
		int yýl = klavye.nextInt();

		boolean artýkYýlmý = yýl % 4 == 0;

		artýkYýlmý = artýkYýlmý && yýl % 100 != 0;

		artýkYýlmý = artýkYýlmý || yýl % 400 == 0;
		
		artýkYýlmý = (yýl % 4 == 0 && yýl % 100 != 0) || (yýl % 400 == 0); //Tüm iþlem bir satýrda yapýldý..

		if (artýkYýlmý) {
			System.out.println(yýl + " artýk yýldýr.");
		} else {
			System.out.println(yýl + " artýk yýldeðildir");
		}

	}

}
