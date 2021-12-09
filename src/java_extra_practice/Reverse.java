package java_extra_practice;

public class Reverse {

	
	public static void main(String[] args) {
		/*
	    	Ask user to enter his/her last name, 
		 * then print its inverse on the console. (Interview Question)
         If the last name is Walker output will be reklaW
		*/ 
		//             012345   
		String name = "all class"; // length of String is 6
		//                 543210           0
		for(int i=name.length()-1; i >= 0; i--) {
			//         nugliN                  543210
			System.out.println(name.charAt(i));
		}
		
		
	}
}
