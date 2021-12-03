package recursive;
/**
 * @author CELÝL
 *
 */
public class ReserveString {

	public static void main(String[] args) {
		String str = "Freedom For Dream";

		// cevir(str);

		System.out.println(cevir(str));
	}

	public static String cevir(String str) {

		if (str.isEmpty())
			return str;
		return cevir(str.substring(1)) + str.charAt(0);
	}

}
