/**
 * 
 */
package studentPractise;

import java.util.Scanner;

/**
 * @author CEL�L
 */
public class Atm2 {

	static String kartNo="1";
	static String sifre="a";
//	static Scanner scan=new Scanner(System.in);
	static int bakiye;
	public static void main(String[] args) {
		String kart ="";
		String sifrem ="";
		Scanner scan=new Scanner(System.in);     
	        do {
	            System.out.println("Kart numaranizi giriniz.");          
	            kart = scan.nextLine();            
	            System.out.println("Lutfen sifrenizi giriniz.");            
	            sifrem = scan.nextLine();
	                     
	            if (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNo)) {             
	                System.out.println("Hatali giris yaptiniz");           
	            }      
	        } while (!sifre.equals(sifrem) || !kart.replaceAll("\\s", "").equals(kartNo));        
	        menu();	
	        scan.close();
}
	public static void cikis() {
		System.out.println("Islemleriniz sonlandirilmistir.\nBizi tercih ettiginiz icin tesekk�r eder, yine bekleriz..");
	
	}
	public static void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen men�den yapmak istediginiz islemin nosunu giriniz..");
		System.out.println("Islem Men�s�: \n1. Bakiye Sorgula \n2. Para Yatirma \n3. Para Cekme \n"
				+ "4. Para G�nderme \n5. Sifre Degistirme \n6. Cikis");
		int secim=sc.nextInt();
		
		switch (secim) {
		case 1:
			bakiyeSorgula();
			break;
		case 2:
			paraYatirma();
			break;
		case 3:
			paraCekme();
			break;
		case 4:
			paraGonderme();
			break;
		case 5:
			sifreDegistirme();
			break;
		case 6:
			cikis();
			break;
		default:
			break;
			
		}
		sc.close();}
	
	
	public static void sifreDegistirme() {
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen mevcut sifrenizi giriniz..");
		String sifreEski=sc.next();
		if(sifreEski.equals(sifre)) {
			System.out.println("L�tfen yeni sifreyi giriniz..");
			String sifreYeni=sc.next();
			System.out.println("Sifreniz basariyla g�ncellenmistir..\nYeni sifreniz : "+sifreYeni);
		}else {System.out.println("Eski sifrenizi yanlis girdiniz.. L�tfen tekrar deneyin..\n");
		sifreDegistirme();
			}
		menu();		
		sc.close();}
	public static void paraGonderme() {
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen para g�ndermek istediginiz IBAN'i girin..");
		String iban=sc.nextLine();
		iban=iban.replace("\\s", "");
		
		if(iban.length()==26&&iban.substring(0,2).equalsIgnoreCase("tr")) {
			System.out.println("Hesap no basariyla girilmistir..\n");
			System.out.println("L�tfen g�ndermek istediginiz tutari giriniz.. ");
			int tutar=sc.nextInt();
			if(bakiye>=tutar) {
				bakiye-=tutar;
				System.out.println(tutar+"TL basariyla g�nderilmistir.\nYeni Bakiyeniz : "+bakiye+"TL'dir\n");}
			else {System.out.println("G�ndermek istediginiz tutar icin bakiyeniz yeterli degildir..\nYeni Bakiyeniz : "
					+bakiye+"TL'dir\n");
			menu();}
		}else {System.out.println("Yanlis IBAN girdiniz..\nL�tfen IBAN'i kontrol ederek tekrar giriniz..");
			paraGonderme();}
		
		menu();	
	sc.close();}
	public static void paraCekme() {
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen cekmek istediginiz tutari girin..");
		int paraCek=sc.nextInt();
		if(bakiye>=paraCek) {
			bakiye-=paraCek;
			System.out.println("Yeni Bakiyeniz : "+bakiye+"TL'dir\n");
		}else {System.out.println ("Bu turar icin bakiyeniz yeterli degil..\nL�tfen bakiyenize uygun bir miktar giriniz."
				+ "\nMevcut Bakiyeniz : "+bakiye+"TL'dir..\n");
		paraCekme();}
		menu();
		sc.close();}
	public static void paraYatirma() {
		Scanner sc=new Scanner(System.in);
		System.out.println("L�tfen yatirmak isteginiz tutari girin..");
		int paraYatir=sc.nextInt();
		bakiye+=paraYatir;
		System.out.println(paraYatir+"TL basariyla hesabiniza aktarilmistir..\nYeni bakiyeniz : "+bakiye+"TL'dir..\n" );
		menu();
	sc.close();}
	public static void bakiyeSorgula() {
		bakiye=0;
		System.out.println("Bakiyeniz : "+bakiye+"TL'dir..\n");
		menu();
		
	}
	public static void giris() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("L�tfen kart no giriniz..");
		String kartNoUser=sc.nextLine();
		kartNoUser=kartNoUser.replaceAll(" ", "");
		System.out.println("L�tfen sifreyi giriniz..");
		String sifreUser=sc.next();
		if(!kartNoUser.equals(kartNo)||!sifreUser.equals(sifre)) {
			System.out.println("Yanlis kart no veya sifre girdiniz.. l�tfen tekrar deneyin..\n ");
			giris();
		}else {System.out.println("Kart no ve sifre basariyla kabul edilmistir..");
		}
		menu();		
	sc.close();}
}