package Eng_Examples;

public class RelationalAndEqualityOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);//false 
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		int x = 100;
		int y = 90;
		boolean result=x>y;//because the answer is true100bigger than90
		
		System.out.println(result);
		
		result=x==y;//false
		System.out.println(result);//100!=90
		
		
		System.out.println(x==y);//comparing
		System.out.println(x=y);//reassigning now x=y,we change the value of x;
		System.out.println(x);//90
		
		boolean result1=x==y;
		System.out.println(result1);
		
		
		byte num=10;
		byte num1 =10;
		boolean bool = num>=num1;//true
		
		System.out.println("Result of boo = "+bool);
		
		
			
	}

}