package studentPractise;

import java.util.Scanner;

public class Banka {

    @SuppressWarnings("unused")
	private int alinan_para;
    static int odenen_para;
    static double kalan_borc;
    static int taksit_sayisi;
    static int taksit_miktari;
    static double faiz_orani;

    static Scanner klavye = new Scanner(System.in);

    Banka(int alinan_para) {

    }

    public static void borcHesapla(int alinan_para, int odenen_para, int taksit_sayisi) {
        System.out.println("1000 TL borcunuz var. pe�in olarak �dedi�iniz miktar� TL cinsinden yaz�n�z: ");
        odenen_para = klavye.nextInt();

        System.out.println("ka� taksit ile �demek istersiniz? ");
        taksit_sayisi = klavye.nextInt();
        kalan_borc = (alinan_para - odenen_para);
        System.out.println("kalan bor�: " + kalan_borc);
    }

    public static double faizHesapla(int kalan_borc, int taksit_sayisi) {
        double faiz = 0;
        if (taksit_sayisi < 12) {
            faiz_orani = 0;
            faiz = kalan_borc / taksit_sayisi;
        } else {
            faiz_orani = 0.5;
            faiz = kalan_borc * 0.5 + kalan_borc / taksit_sayisi;
        }

        return faiz;
    }

    public static double taksitHesapla(double kalan_borc, int taksit_sayisi) {
        double taksit = kalan_borc / taksit_sayisi;
        return taksit;
    }

    public static void borcSil(int odenen_para, int kalan_borc) {
        kalan_borc = kalan_borc - odenen_para;

    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        System.out.println("bankam�z�n ka� y�ll�k �yesisiniz? ");
        int uyelik_sure = klavye.nextInt();

        if (uyelik_sure >= 12) {
            System.out.println("bir y�ldan fazla s�redir m��terimiz oldu�unuz i�in sizleri SIFIR FA�Z ile destekliyoruz...\n i�lemlerinize s�f�rFaiz departman�m�zdan devam ediyorsunuz...");

            SifirFaiz sifirFaiz = new SifirFaiz(odenen_para);

        } else {
            //Banka();
        }

        borcHesapla(1000, 100, 3);
    }
    
    
}



