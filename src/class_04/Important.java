package class_04;

public class Important {

	public static void main(String[] args) {
		
		//debug your code and analyze the error
		// do not make that mistake
		
		int score=85;
        boolean assignment=true;
        
        if(assignment) {//outer condition
       	 
       	 
       	 if(score>90) {
       		 System.out.println("Great job");
       
       	 }else if(score>70) {
       		System.out.println("study more");//the code will not come further cause 85>70
       	 
       	 }else if (score>80) {
       		 System.out.println("Good job");
       	 
       	 
       	 }else {
       		 System.out.println("Good job for trying but you must study more");
       	}

        }else {//outer condition
       	 System.out.println("u should complete all assignments");
        }
           

	}

}
