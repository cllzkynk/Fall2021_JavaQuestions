package bolum02_�l�m02;

import java.util.Scanner;

public class FahrenayttanDereceyeCevir {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System .in);
		System.out.println("Dereceye d�n��t�rmek i�in bir fahrenaty girin");
		
		int fahrenayt = klavye.nextInt();
		double derece = (5.0 / 9) * (fahrenayt - 32);// int derece = (int)((5.0 / 9) * (fahrenayt - 32)),buda di�er ��z�m..	
		
		//int derece = (int)((5.0 / 9) * (fahrenayt - 32));
		System.out.println (fahrenayt + " fahrenayt " + derece + " derecedir");
		
		

	}

}
