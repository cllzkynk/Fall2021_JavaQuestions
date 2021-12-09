package practice_1;

public class OCA {

	
	
	public static void main(String[] args) {
		String str = "M ";
		str = str.concat("E ");
		String add = "S ";
		str = str.concat(add);
		str.replace("S","T");
		str = str.concat(add);
		System.out.println(str);
		
		 
			
			int num = 10;
			do {
			System.out.print(num-- + " ");
			} while (num == 0);
			/*
			What is the result?
			A) 543210
			B) 9
			C) 421
			D) 10
			E) Nothing is printed
		*/
			
			
			/*
			There is a lonely monkey in the island 
			He needs to eat 4 bananas every day
			there are just 165 bananas in that island 
			Create following variables and find how many days 
			monkey can survive.
			Use do while loop, increment and decrement and if statements
			int numberOfBananas =165, survivalDays = 1;
			boolean monkeyAlive = true;
       		*/
			int numberOfBananas = 165, survivalDays = 1;
			boolean monkeyAlive = true;
			
			do {
				
				
				System.out.println("Monkey eats 4 bananas ");
				numberOfBananas -= 4;
				
				
				
				if(numberOfBananas <= 0) {
					monkeyAlive = false;
					System.out.println("Today monkey died "+ survivalDays);
				}else {
					System.out.println("Monkey is alive and day is "+ survivalDays++);
				}
				
			}while(monkeyAlive);
			
			
			System.out.println("number of survival for monkey is " + survivalDays);
			/*
			create a method called numberOfChars and pass 2 parameters 1- char 2- String
			char ch = 'p';
			String str = "population is number of people";
			int count = 0; 
			then find how many times the given char is repeated in the String
			and print it on the console
			use for loop, increment and if statements  
			*/
			
			/*
			Given a String print out the sum of all digits(numbers) in the String 
			ignoring all other characters.
			String sentence = "I have 5 and he has 8 apples";
		 	*/
			
			String sentence = "I have 5 and he has 8 apples";
			/*
			sentence = sentence.replaceAll("\\D", "");
			System.out.println(sentence);
		    int n1 = Integer.parseInt(sentence.substring(0,1)) ;
		    int n2 =  Integer.parseInt(sentence.substring(1,2));
		    System.out.println("sum of the numbers in a String "+(n1+n2));
		    */
			int sum =0;
		    for(int i=0; i<sentence.length();i++) {
		    	if(Character.isDigit(sentence.charAt(i))) {
		    		 sum += Integer.parseInt(sentence.substring(i,i+1));
		    		
		    	}
		    }
		    
		    System.out.println("sum of numbers in String: "+sum);
		    
		    
		    
			numberOfChars("population", 'p');
	}
	
      
	
	
	public static void numberOfChars(String str, char myChar) {
		int count = 0; 
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == myChar) {
				count++;
			}
		}
		// polindrome 
		System.out.println("my char is repeated in the String "+count+" times");
		
	}
	
	
	
}
