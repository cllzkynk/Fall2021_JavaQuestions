package class_04;

public class TaskInClass {

	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=8;
		
		
		if(diploma) {//if yes we do further check of gpa
			
		System.out.println("Congratulations");
			
		    if(gpa>=3.5) {		
			System.out.println("You're eligible for scholarship");
		    }else {	
			System.out.println("You sould study harder");
		    }
			
			
		}else {
		System.out.println("Please get a degree");
		}
	}

}
