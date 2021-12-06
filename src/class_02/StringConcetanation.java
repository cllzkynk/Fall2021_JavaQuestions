package class_02;

public class StringConcetanation {

	public static void main(String[] args) {
		
		String name="Olga";
		// i would like to say : My name is Olga
		
		System.out.println("My name is "+name);
	
		String lastName ="Ostash";
		
		
		//I would like to pring Olga Ostash 
		
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		System.out.println(name+" lives in " +city);
		
		char grade='B';
		//Olga is B student
		
		System.out.println(name+" is  "+grade+" student");
		
		int age=21;
		// olga is 21 years old
		System.out.println(name+" is "+age+" years old");
		
		//to concatenate/attach any value(char,int,String,double to a string) we use +(String concatenation operator)
	
		int date=27;
		String month= "September";
		System.out.println(date+" "+month);
		
		String state ="DC"; // two caracters
		String anotherState=" DC";//three characters
		//above strings are not equal
		
		System.out.println(state);
		System.out.println(anotherState);
		
		String name1="Maria";
		String city1="Dnipro";
		
		System.out.println(name1+" lives in " +city1);
		
		
		
		
		
		
		
	}
			
}
