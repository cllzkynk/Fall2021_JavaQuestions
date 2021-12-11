package bolum02;

public class AsalSayilariYazdir {
	public static void main(String[] args) {
		
		int asalSayiSayaci = 0;
		int sayi = 2;
		while(asalSayiSayaci < 50) {
			boolean asalMI = true;
			
			//TODO say� asal m�?
			//FIXME asal say� bulan algoritmay� yaz
			
			for(int i = 2; i < sayi; i++) {
				if(sayi % i == 0) {
					asalMI = false;
					
				}
			}
			if(asalMI == true) {
				asalSayiSayaci ++;
				System.out.println(asalSayiSayaci + ". asal say�: " + sayi);
			}
			sayi ++;
			
		}
	}

}
