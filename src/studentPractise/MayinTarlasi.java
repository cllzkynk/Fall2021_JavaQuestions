package studentPractise;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

	public static int[][] haritaDoldu(int satir, int sutun)
	{
		Random rnd = new Random();
		
		int[][] matris = new int[satir][sutun];
		int i = 0;
		while(i < satir)
		{
			int j = 0;
			while(j < sutun)
			{
				matris[i][j] = rnd.nextInt();
				j = j + 1;
			}
			i = i + 1;
		}
		for(int k = 0; k < satir; k++) {
			for(int l = 0; l < sutun; l++) {
				//System.out.println(matris[k][l] + " ");
			//System.out.println();	
			}
		}
		return matris;
	}
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Oyunun satır boyutunu giriniz: ");
		int a = klavye.nextInt();
		System.out.println("Oyunun sutun boyutunu giriniz: ");
		int b = klavye.nextInt();
		int [][] oyunMatrisi = haritaDoldu(a,b);
		int puan = 0;
		boolean kontrol = true;
		while(kontrol)
		{
			System.out.println("Seçtiniz konumun satır değerini giriniz: ");
			int x = klavye.nextInt();
			System.out.println("Seçtiniz konumun sutun değerini giriniz: ");
			int y = klavye.nextInt();
			if(oyunMatrisi[x][y] == 1)
			{
				kontrol = false;
			}
			else
			{
				puan = puan + 10;
				System.out.println("Hata hayattasın... Devam");
			}
		}
		System.out.println("");
	}
}