package bolum02 ;

public class HarcHesaplama {

	public static void main(String[] args) {
         double harc = 10_000;
         int yil = 0;
         
         while(harc < 20_000) {
        	 harc *= 1.07;
        	 yil++;
         }
         System.out.printf(yil + " y�l sonra Harc %.3f olacakt�r", harc);
	}

}
