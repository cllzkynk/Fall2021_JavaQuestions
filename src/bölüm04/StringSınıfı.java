package bölüm04;

public class StringSýnýfý {
	public static void main(String[] args) {
		String yazý = "Merhaba java!";
	
		
		System.out.println(yazý.length());//stringin uzunluðunu veren bir metottur.
		                                 //13 verir.Ýlk karakter 0.,,son karakter 12.dir.Toplam 13 karakter var
		System.out.println(yazý.charAt(0));//Ýlk karakteri verecek
		System.out.println(yazý.charAt(2));//3.karakteri verir
		System.out.println(yazý.charAt(12));//13. karakteri verir.
		//System.out.println(yazý.charAt(13));//Hata verir.Çünkü 14. karakterimz yok.Java bii burda kýsýtlar.StringIndexOutOfBoundsException
		
		String yazý2 = " java çok güzel";
		yazý.concat(yazý2);
		String yazý3 = yazý.concat(yazý2);//yazý(Merhaba Java) ile yazý2(java çokgüzel) yi birleþtir..
				                         // yazý3 e ata demektir.
		
		System.out.println(yazý);
		System.out.println(yazý3);
		
		System.out.println(yazý + yazý2);//Yukarý ile ayný iþlevi gördüðünden concat genelde kullanýlmaz.
		
		yazý.toUpperCase();
		System.out.println(yazý);
		System.out.println(yazý.toUpperCase());//Hepsini büyük harf yapar.
		System.out.println(yazý.toLowerCase());//Hepsini küçük harf yapar
		
		
		yazý = "                 jsds     dksd              ";
		System.out.println(yazý);
		System.out.println(yazý.trim());//sol ve saðdaki bütün boþluklarý temizler..
		
        char ch = yazý.charAt(yazý.length() -1);
        System.out.println(ch);
		
		
 	}

}

