package b�l�m04;

public class StringS�n�f� {
	public static void main(String[] args) {
		String yaz� = "Merhaba java!";
	
		
		System.out.println(yaz�.length());//stringin uzunlu�unu veren bir metottur.
		                                 //13 verir.�lk karakter 0.,,son karakter 12.dir.Toplam 13 karakter var
		System.out.println(yaz�.charAt(0));//�lk karakteri verecek
		System.out.println(yaz�.charAt(2));//3.karakteri verir
		System.out.println(yaz�.charAt(12));//13. karakteri verir.
		//System.out.println(yaz�.charAt(13));//Hata verir.��nk� 14. karakterimz yok.Java bii burda k�s�tlar.StringIndexOutOfBoundsException
		
		String yaz�2 = " java �ok g�zel";
		yaz�.concat(yaz�2);
		String yaz�3 = yaz�.concat(yaz�2);//yaz�(Merhaba Java) ile yaz�2(java �okg�zel) yi birle�tir..
				                         // yaz�3 e ata demektir.
		
		System.out.println(yaz�);
		System.out.println(yaz�3);
		
		System.out.println(yaz� + yaz�2);//Yukar� ile ayn� i�levi g�rd���nden concat genelde kullan�lmaz.
		
		yaz�.toUpperCase();
		System.out.println(yaz�);
		System.out.println(yaz�.toUpperCase());//Hepsini b�y�k harf yapar.
		System.out.println(yaz�.toLowerCase());//Hepsini k���k harf yapar
		
		
		yaz� = "                 jsds     dksd              ";
		System.out.println(yaz�);
		System.out.println(yaz�.trim());//sol ve sa�daki b�t�n bo�luklar� temizler..
		
        char ch = yaz�.charAt(yaz�.length() -1);
        System.out.println(ch);
		
		
 	}

}

