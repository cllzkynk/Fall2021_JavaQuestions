package recursive;

public class Polindrome {

	

	public static void main(String[] args) {
		String str = "Adanada";

		// cevir(str);

		String Pstr=cevir(str);
		
		if(str.equals(Pstr)) {
			System.out.println("Polondromdur");
		}else {
			System.out.println("Polindrome degil");
		}
	}

	private static String cevir(String str) {

		if (str.isEmpty())
			return str;
		return cevir(str.substring(1)) + str.charAt(0);
	}

}
