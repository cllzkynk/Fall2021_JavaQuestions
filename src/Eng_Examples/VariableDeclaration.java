package Eng_Examples;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1st way to create a variable:
		
		//create variable = assigning value
		//declare a variable = initializing
		
      double $num=12.99;
      
      //2nd way to create a variable:
      //declare a variable or create it
      //initialize or assign value
      
      int myBox;//we declare variable only once
      myBox=135;//assigning the value
      System.out.println(myBox);//135
      
      myBox=155;//reassigning the value
      myBox=2000;
      System.out.println(myBox);//155
      
      
      
      //3 way
      int num1, num2, num3; //if variable is of same type we can declare all in one line
      
      num1=10;
      num2=20;
      num3=30;
      //but the assignment has to be in different lines
      
      System.out.println(num3);
      
      char char1='C';
      char char2='d';
      char char3=char1;
      
      
      
      System.out.println(char3); //it's read from right to left
      
      
      
      
    		  
      
      
      
      
      
      
	}

}
