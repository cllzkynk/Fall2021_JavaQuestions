package level_3;

/**
 * @author CELİL
 *
 */
public class Reverse_String_For_Loop {
public static void main(String[] args) {
		
	String str="The creator's language of creation is mathematics.";
	String reserve="";
	
	for (int i = str.length()-1; i>=0; i--) {
		reserve+=str.charAt(i);
		
	}
System.out.println(reserve);
	}

}
