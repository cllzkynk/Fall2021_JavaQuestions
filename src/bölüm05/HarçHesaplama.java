package b�l�m05;

public class Har�Hesaplama {

	public static void main(String[] args) {
         double harc = 10_000;
         int y�l = 0;
         
         while(harc < 20_000) {
        	 harc *= 1.07;
        	 y�l++;
         }
         System.out.printf(y�l + " y�l sonra Harc %.3f olacakt�r", harc);
	}

}
