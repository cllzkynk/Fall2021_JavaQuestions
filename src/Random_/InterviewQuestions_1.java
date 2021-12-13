package Random_;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class InterviewQuestions_1 {
	/*
	 * Create a list by getting the list elements from user if there is duplicated
	 * elements remove them from the list. ​ Kullanıcıdan aldıgınız elemanlardan
	 * oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> girilenList = new ArrayList<Integer>();
		List<Integer> tekrarsizList = new ArrayList<Integer>();
		System.out.print("Listeye eklemek istedikleriniz sayilari giriniz\nGirisi bitirmek icin Q giriniz : ");

		String cikis = "";
		do {
			if (scan.hasNextInt()) {
				int giris = scan.nextInt();
				girilenList.add(giris);
				if (!tekrarsizList.contains(giris)) {
					tekrarsizList.add(giris);
				}
			} else {
				cikis = "Q";
			}

		} while (!cikis.equals("Q"));

		System.out.println("Girilen   liste ==>" + girilenList+"\nTekrarsiz liste ==>" + tekrarsizList);


		scan.close();
	}

}
