package bölüm04;

public class StringiİntegeraÇevirma {

	public static void main(String[] args) {
        String str = "12345"; 
        
        int sayı = Integer.parseInt(str);//string olan sayıları,,int olarak sayıya çevirdik..
        System.out.println(sayı);
        
        double doubleValue = Double.parseDouble("55.78");//Double olarak çevirdik
        System.out.println(doubleValue);
        
	}

}
