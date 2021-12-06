package bölüm04;

public class SubStringÖrneði {
	public static void main(String[] args) {
		String str = "Merhaba Java";
		String str2 = str.substring(6);// 6.karekterden sonrasýný alýr
		System.out.println(str2);

		System.out.println(str.substring(3));

		String str3 = str.substring(3, 7);//3 ile 7 ci karekter arasýný alýr
		System.out.println(str3);
		
		String str4 =str.replaceAll("haba", "selim");//haba nýn yerine selim i yazdý..
		System.out.println(str4);
		
		String message = "Welcome to Java";
		message = message.substring(0, 11) + "HTML";//0 il 11 in arasýný aldý HTML yi ekledi..
		System.out.println(message);
		
		message.indexOf('o');
		System.out.println(message.indexOf('o'));//o yu ilk bulduðu yeri yazar.
		System.out.println(message.indexOf('o' , 5));// o yu ilk bulduktan sonra 6 karaktere bak.2. o varsa onun yerini yazar.
		
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome to Java".indexOf('w'));//w olmadýðý için -1 verdi
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));//Baþlangýç imleci 3 dür
		System.out.println("Welcome to Java".indexOf("Java",5));
		System.out.println("Welcome to Java".indexOf("Java",5));
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Welcome to Java".lastIndexOf('W'));//aramaya sondan baþla demek
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o',5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("Java",5));
		System.out.println("Welcome to Java".lastIndexOf("Java"));
		
	}

}
