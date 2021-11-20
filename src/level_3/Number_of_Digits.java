/**
 * 
 */
package level_3;

/**
 * @author CELÝL
 *
 */
public class Number_of_Digits {
public static void main(String[] args) {
	long num =142222415L;
	int counter=0;
	
	while (num !=0) {
		num=num/10;
		counter ++;
	}
System.out.println("Number of digits  "+ counter);
	}

}
