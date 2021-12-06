package class_03;

public class PrimitiveTypeCastingNewTopic {

	public static void main(String[] args) {
		 
		
	double d=15/7;//widening(2.0)
	System.out.println(d);
	
	double e=9; //widening happens (9.0)
	System.out.println(e);
	
	//we're trying to take int value and assing double to it.
	//that;s why .0 appears;
	
	//int i=9.99; error  WHY?
	
	//casting in Java -->converting one type to another;
	//2 types of casting :
	//-widening-implicit(authomatic);
	//byte->short->int->long->float->double SMALLER coverting into bigger;
	
	
	
	//-narrowing-explicit (manually);
	//double->float->long->int->short->byte BIGGER data type into smaller
	
	int i=(int)9.99;//narrowing happens (9)
	System.out.println(i);
	
	byte b=(byte)130;//narrowing  (whatever value)
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
