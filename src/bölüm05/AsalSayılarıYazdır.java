package b�l�m05;

public class AsalSay�lar�Yazd�r {
	public static void main(String[] args) {
		
		int asalSay�Sayac� = 0;
		int say� = 2;
		while(asalSay�Sayac� < 50) {
			boolean asalMI = true;
			
			//TODO say� asal m�?
			//FIXME asal say� bulan algoritmay� yaz
			
			for(int i = 2; i < say�; i++) {
				if(say� % i == 0) {
					asalMI = false;
					
				}
			}
			if(asalMI == true) {
				asalSay�Sayac� ++;
				System.out.println(asalSay�Sayac� + ". asal say�: " + say�);
			}
			say� ++;
			
		}
	}

}
