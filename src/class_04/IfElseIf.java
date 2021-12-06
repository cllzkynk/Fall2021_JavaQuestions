package class_04;

public class IfElseIf {

	public static void main(String[] args) {
		
		/*we need to compare 2 numbers:
		 * bigger,smaller or equal
		 */
    int num1=99;
    int num2=99;
    
    if (num1>num2) {//what if this is true
    System.out.println(num1+ " is bigger than "+num2);
   
    } else if(num1<num2) {//or what if this is true
    	System.out.println(num1+" is smaller than "+num2);
    
    }else {//if all the conditions above aren't true this will be the output
    	System.out.println(num1+ " is equal to "+num2);
    }
    
    System.out.println("--------------------------");
    
    /* based on the day of the week we will print class schedule
     * 
     */
    
    
    int day =1;
    if(day==1) {
    	System.out.println("Today is Monday, we have mo class");
    }else if(day==2) {
        System.out.println("Today is Tuesday, we have manuall class");    
    }else if(day==3){
    	System.out.println("Today is Wednesday, we have manual class again");
    	
    }else if (day==4) {
    	System.out.println("Today is Thursday, we have review class");
    	
    }else if(day ==5) {
    	System.out.println("today is Friday, but I have class tmrw and I will prepare");
    }else if (day==6) {
    	System.out.println("Today is SAturday I missed Java");
    	
    }else if(day==7) {
       System.out.println("Today is Sunday, I did a lot of coding");
    
    }else{
    	System.out.println("This is invalid day");
    	
    }
    
	}

}
