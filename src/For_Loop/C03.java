package JavaKonusalSorular.ForLoop;

public class C03 {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri donduren bir kod
		 * yaziniz.(mulakat Sorusu)
		 * 
		 * Input :
		 * 
		 * String str="Javaisalsoeasy"
		 * 
		 * Output: a s
		 */
		
		String strKontrol = "";
		String str1 = "Javaisalsoeasy";
        for (int i = 0; i < str1.length(); i++) {
            if (!(str1.indexOf(str1.charAt(i)) == str1.lastIndexOf(str1.charAt(i)))) {
                if (!strKontrol.contains(Character.toString(str1.charAt(i)))) {
                    strKontrol += str1.charAt(i)+ " ";
                }
            }
        }
        System.out.println(strKontrol);

		
		
	}

}
