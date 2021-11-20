package level_3;

/**
 * @author CELÝL
 *
 */
public class Power_Number {
public static void main(String[] args) {
		
	int base=2;
	int exponent=5;
	long result=1;
	
	////First way
	
	while (exponent!=0) {
		result*=base;
		--exponent;
	}	
	
	System.out.println("Answer with While loop : "+result);
	
	
	//Second way
	
	for (int i = 1; i < exponent; i++) {
		result*=base;
	}
	System.out.println("Answer with for loop   : "+result);
	
	
	
	
	
	
	
	
	
	
	}

}
