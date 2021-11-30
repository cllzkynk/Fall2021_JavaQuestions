package studentPractise;

import java.util.Scanner;

public class Banka {

    private int alýnan_para;
    static int ödenen_para;
    static double kalan_borc;
    static int taksit_sayýsý;
    static int taksit_miktarý;
    static double faiz_oraný;

    static Scanner klavye = new Scanner(System.in);

    Banka(int alýnan_para) {

    }

    public static void borcHesapla(int alýnan_para, int ödenen_para, int taksit_sayýsý) {
        System.out.println("1000 TL borcunuz var. peþin olarak ödediðiniz miktarý TL cinsinden yazýnýz: ");
        ödenen_para = klavye.nextInt();

        System.out.println("kaç taksit ile ödemek istersiniz? ");
        taksit_sayýsý = klavye.nextInt();
        kalan_borc = (alýnan_para - ödenen_para);
        System.out.println("kalan borç: " + kalan_borc);
    }

    public static double faizHesapla(int kalan_borc, int taksit_sayýsý) {
        double faiz = 0;
        if (taksit_sayýsý < 12) {
            faiz_oraný = 0;
            faiz = kalan_borc / taksit_sayýsý;
        } else {
            faiz_oraný = 0.5;
            faiz = kalan_borc * 0.5 + kalan_borc / taksit_sayýsý;
        }

        return faiz;
    }

    public static double taksitHesapla(double kalan_borc, int taksit_sayýsý) {
        double taksit = kalan_borc / taksit_sayýsý;
        return taksit;
    }

    public static void borcSil(int ödenen_para, int kalan_borc) {
        kalan_borc = kalan_borc - ödenen_para;

    }

    public static void main(String[] args) {

        System.out.println("bankamýzýn kaç yýllýk üyesisiniz? ");
        int üyelik_süre = klavye.nextInt();

        if (üyelik_süre >= 12) {
            System.out.println("bir yýldan fazla süredir müþterimiz olduðunuz için sizleri SIFIR FAÝZ ile destekliyoruz...\n iþlemlerinize sýfýrFaiz departmanýmýzdan devam ediyorsunuz...");

            SýfýrFaiz sýfýrFaiz = new SýfýrFaiz(ödenen_para);

        } else {
            //Banka();
        }

        borcHesapla(1000, 100, 3);
    }
    
    
}



