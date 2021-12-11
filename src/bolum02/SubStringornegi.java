package bolum02 ;

public class SubStringornegi {
	public static void main(String[] args) {
		String str = "Merhaba Java";
		String str2 = str.substring(6);// 6.karekterden sonras�n� al�r
		System.out.println(str2);

		System.out.println(str.substring(3));

		String str3 = str.substring(3, 7);//3 ile 7 ci karekter aras�n� al�r
		System.out.println(str3);
		
		String str4 =str.replaceAll("haba", "selim");//haba n�n yerine selim i yazd�..
		System.out.println(str4);
		
		String message = "Welcome to Java";
		message = message.substring(0, 11) + "HTML";//0 il 11 in aras�n� ald� HTML yi ekledi..
		System.out.println(message);
		
		message.indexOf('o');
		System.out.println(message.indexOf('o'));//o yu ilk buldu�u yeri yazar.
		System.out.println(message.indexOf('o' , 5));// o yu ilk bulduktan sonra 6 karaktere bak.2. o varsa onun yerini yazar.
		
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome to Java".indexOf('w'));//w olmad��� i�in -1 verdi
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));//Ba�lang�� imleci 3 d�r
		System.out.println("Welcome to Java".indexOf("Java",5));
		System.out.println("Welcome to Java".indexOf("Java",5));
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Welcome to Java".lastIndexOf('W'));//aramaya sondan ba�la demek
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o',5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("Java",5));
		System.out.println("Welcome to Java".lastIndexOf("Java"));
		
	}

}
