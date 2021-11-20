package level_3;



/**
 * @author CELÝL
 *
 */
public class Prime_Number_Interval {
public static void main(String[] args) {
		
	int low =12;
	int high=14;
	
	while (low<high) {
		boolean flag=false;
		for (int i = 2; i <=low/2; i++) {
			
			if (low%i==0) {
				flag=true;
				break;
				
			}
			
		}
		if (!flag&&low!=0&&low!=0) {
			System.out.println(low+ " ");
	++low;	} 
		
	}

	}

}
