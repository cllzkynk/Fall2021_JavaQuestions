package b�l�m05;

import java.util.Scanner;

public class �oklu��karmaAras�nav� {

	public static void main(String[] args) {
		Scanner java = new Scanner(System.in);
		long ba�lang��Zaman� = System.currentTimeMillis();
		String rapor = "";
		int saya� = 0;
		int do�ruSayac� = 0;
		while (saya� < 5) {

			int say�1 = (int) (Math.random() * 10);
			int say�2 = (int) (Math.random() * 10);

			int ge�iciSay� = 0;
			if (say�1 < say�2) {
				say�1 = ge�iciSay�;
				say�1 = say�2;
				say�2 = ge�iciSay�;
			}
			System.out.println(say�1 + " - " + say�2 + " =?");
			int cevap = java.nextInt();

			if (say�1 - say�2 == cevap) {
				System.out.println("bildiniz");
				do�ruSayac�++;
				rapor += say�1 + " - " + say�2 + " = " + cevap + " do�ru\n";
						
			} else {
				System.out.println("Bilemediniz");
				rapor += say�1 + " - " + say�2 + " = " + cevap + " yanl��\n";
			}
			saya� ++;
		}
		long biti�Zaman� = System.currentTimeMillis();
		
		System.out.println("toplam s�re : " + (biti�Zaman� - ba�lang��Zaman�) / 1000 + " saniyedir");
		System.out.println(saya� + " tane soru soruldu");
		System.out.println(do�ruSayac� + " tane do�ru cevap verdiniz");
		System.out.println(rapor);
		java.close();

	}

}
