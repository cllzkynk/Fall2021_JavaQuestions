package level_2;

public class Convert_Numbers_To_String {

	public static void main(String[] args) {
		int a = 12345;
		String str = Integer.toString(a);

		System.out.println(str);

		System.out.println("=======================");

		String str1 = "12455";
		long result = Long.parseLong(str1);

		System.out.println(result);
		
		
		System.out.println("=======================");
		
		
		String str2 = "13.6";
		float f = Float.parseFloat(str2);
		System.out.println(f);
		
		System.out.println("=======================");
		
		String str3="6.8575";
		double d=Double.parseDouble(str3);
		System.out.println(d);
		
	}

}
