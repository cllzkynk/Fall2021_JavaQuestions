package bölüm05;

public class AsalSayılarıYazdır {
	public static void main(String[] args) {
		
		int asalSayıSayacı = 0;
		int sayı = 2;
		while(asalSayıSayacı < 50) {
			boolean asalMI = true;
			
			//TODO sayı asal mı?
			//FIXME asal sayı bulan algoritmayı yaz
			
			for(int i = 2; i < sayı; i++) {
				if(sayı % i == 0) {
					asalMI = false;
					
				}
			}
			if(asalMI == true) {
				asalSayıSayacı ++;
				System.out.println(asalSayıSayacı + ". asal sayı: " + sayı);
			}
			sayı ++;
			
		}
	}

}
