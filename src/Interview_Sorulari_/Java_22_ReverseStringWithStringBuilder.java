package Interview_Sorulari_;

public class Java_22_ReverseStringWithStringBuilder {

	public static void main(String[] args) {

		// ReverseStringWithStringBuilder
		
		String str = "Reverse String";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);

	}

}


