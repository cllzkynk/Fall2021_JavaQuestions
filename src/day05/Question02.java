package day05;
import java.util.ArrayList;
import java.util.Scanner;
/*
 	Kullanicidan alinan degerleri ArrayList'e ceviren Java programini
 	yaziniz. Kullanici deger girmek istemedigi zaman eklemeyi bitirin
 	
 	 */
public class Question02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>();
		int count = 0;
		do {
			
			System.out.println("Deger girmek istiyorsaniz E'ye girmek istemiyorsaniz H'ye basiniz");
			char secim = scan.next().toUpperCase().charAt(0);
			if (secim == 'E') {
				System.out.println("Lutfen bir String deger giriniz");
				arrayList.add(scan.next());
			} else if (secim == 'H') {
				System.out.println("Eklemeleriniz icin tesekkurler iyi gunler dileriz");
				break;
			} else {
				count++;
				if(count == 3) {
					System.out.println("3 kere yanlis girdiniz bloke oldu");
					break;
				}
				
				System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
			}
		} while (true);
		
		System.out.println(arrayList);
	}
}