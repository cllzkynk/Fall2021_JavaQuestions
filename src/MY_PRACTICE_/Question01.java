package days04;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
	
	/*kullanıcıdan bir isim alın ve bu ismi char array ine dönüstüren bir method yazın.
	 * 
	 * (toCharArray methodunu kullanmayın.
	 * input: John
	 * Output: [J, o, h, n]
	 */
	
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir isim giriniz");
		String isim=scan.next();
		
	    System.out.println(Arrays.toString(charaDonustur(isim)));
	    char harfler2[]=charaDonustur(isim);
	    System.out.println(Arrays.toString(harfler2));
	}
	
	
	public static char[] charaDonustur(String isim) {
		
		char harfler[]=new char[isim.length()];//Techpro t, e, c, h, p, r, o
		//char temp=' ';
			for(int i=0; i<isim.length(); i++) {
				harfler[i]=isim.charAt(i);//harfler[3]='c';
				
				
			}
			System.out.println(Arrays.toString(harfler));
			return harfler;
		
		
	}

}
