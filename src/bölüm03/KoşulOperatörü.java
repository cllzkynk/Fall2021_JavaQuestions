package bölüm03;

public class KoþulOperatörü {
	public static void main(String[] args) {
        int x = 5;
        int y;
        
        if(x > 0) {
        	y = 1;
        } else {
        	y = -1;
        }
        y = (x > 0 ? 1 : -1);
	}

}
