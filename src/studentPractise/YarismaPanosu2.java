package studentPractise;

import java.util.Scanner;

public class YarismaPanosu2 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
        System.out.print("Kac Kisi? : ");
        String kisi=scan.nextLine();
        System.out.print("Kac Soru? : ");
        String soru=scan.nextLine();

        String[] sorular = new String[new Integer(soru)];
        String[][] kisilercevaplar = new String[new Integer(kisi)][new Integer(soru)];
       
        for(int i=0;i<new Integer(soru);i++){
            System.out.println(i+1+". soru: ");
            sorular[i]=scan.nextLine();
        }
       
        for(int h=0;h<new Integer(kisi);h++){
            for(int k=0;k<new Integer(soru);k++){
                System.out.print(h+1+". kisinin ");
                System.out.print(k+1+". sorusu  :"+sorular[k]+" ");
                kisilercevaplar[h][k]=scan.nextLine();
            }
        }
       
        System.out.println("--------------------CEVAP TABLOMUZ----------------------");
        System.out.print("");

        for(int y=0;y<new Integer(kisi);y++){
            System.out.print("    ");
            System.out.print(y+1+".Kisi ");
        }

        System.out.println("");

        for(int u=0;u<new Integer(soru);u++){
            System.out.print(sorular[u]);
            for(int l=0;l<new Integer(kisi);l++){
                    System.out.print("       "+kisilercevaplar[l][u]+" ");
            }
            System.out.println("");
        }
        }
    }