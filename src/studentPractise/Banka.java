package studentPractise;

import java.util.Scanner;

public class Banka {

    private int al�nan_para;
    static int �denen_para;
    static double kalan_borc;
    static int taksit_say�s�;
    static int taksit_miktar�;
    static double faiz_oran�;

    static Scanner klavye = new Scanner(System.in);

    Banka(int al�nan_para) {

    }

    public static void borcHesapla(int al�nan_para, int �denen_para, int taksit_say�s�) {
        System.out.println("1000 TL borcunuz var. pe�in olarak �dedi�iniz miktar� TL cinsinden yaz�n�z: ");
        �denen_para = klavye.nextInt();

        System.out.println("ka� taksit ile �demek istersiniz? ");
        taksit_say�s� = klavye.nextInt();
        kalan_borc = (al�nan_para - �denen_para);
        System.out.println("kalan bor�: " + kalan_borc);
    }

    public static double faizHesapla(int kalan_borc, int taksit_say�s�) {
        double faiz = 0;
        if (taksit_say�s� < 12) {
            faiz_oran� = 0;
            faiz = kalan_borc / taksit_say�s�;
        } else {
            faiz_oran� = 0.5;
            faiz = kalan_borc * 0.5 + kalan_borc / taksit_say�s�;
        }

        return faiz;
    }

    public static double taksitHesapla(double kalan_borc, int taksit_say�s�) {
        double taksit = kalan_borc / taksit_say�s�;
        return taksit;
    }

    public static void borcSil(int �denen_para, int kalan_borc) {
        kalan_borc = kalan_borc - �denen_para;

    }

    public static void main(String[] args) {

        System.out.println("bankam�z�n ka� y�ll�k �yesisiniz? ");
        int �yelik_s�re = klavye.nextInt();

        if (�yelik_s�re >= 12) {
            System.out.println("bir y�ldan fazla s�redir m��terimiz oldu�unuz i�in sizleri SIFIR FA�Z ile destekliyoruz...\n i�lemlerinize s�f�rFaiz departman�m�zdan devam ediyorsunuz...");

            S�f�rFaiz s�f�rFaiz = new S�f�rFaiz(�denen_para);

        } else {
            //Banka();
        }

        borcHesapla(1000, 100, 3);
    }
    
    
}



