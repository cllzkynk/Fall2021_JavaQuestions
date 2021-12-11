package bolum02 ;

public class StringSinifi {
	public static void main(String[] args) {
		String yazi = "Merhaba java!";
	
		
		System.out.println(yazi.length());//stringin uzunlu�unu veren bir metottur.
		                                 //13 verir.�lk karakter 0.,,son karakter 12.dir.Toplam 13 karakter var
		System.out.println(yazi.charAt(0));//�lk karakteri verecek
		System.out.println(yazi.charAt(2));//3.karakteri verir
		System.out.println(yazi.charAt(12));//13. karakteri verir.
		//System.out.println(yazi.charAt(13));//Hata verir.��nk� 14. karakterimz yok.Java bii burda k�s�tlar.StringIndexOutOfBoundsException
		
		String yazi2 = " java �ok g�zel";
		yazi.concat(yazi2);
		String yazi3 = yazi.concat(yazi2);//yazi(Merhaba Java) ile yazi2(java �okg�zel) yi birle�tir..
				                         // yazi3 e ata demektir.
		
		System.out.println(yazi);
		System.out.println(yazi3);
		
		System.out.println(yazi + yazi2);//Yukar� ile ayn� i�levi g�rd���nden concat genelde kullan�lmaz.
		
		yazi.toUpperCase();
		System.out.println(yazi);
		System.out.println(yazi.toUpperCase());//Hepsini b�y�k harf yapar.
		System.out.println(yazi.toLowerCase());//Hepsini k���k harf yapar
		
		
		yazi = "                 jsds     dksd              ";
		System.out.println(yazi);
		System.out.println(yazi.trim());//sol ve sa�daki b�t�n bo�luklar� temizler..
		
        char ch = yazi.charAt(yazi.length() -1);
        System.out.println(ch);
		
		
 	}

}

