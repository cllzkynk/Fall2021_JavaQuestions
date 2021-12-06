package homework2;

public class hw02 {

	public static void main(String[] args) {
		// Write a java method that returns the inverse of the entered number.
		//123 321
	
		System.out.println(reverseNumber(5678));
	}
public static int reverseNumber(int n) {
	int sonuc=0;
	while(n>0) {
	int temp = n%10;
	n/=10;
	sonuc = sonuc*10+temp;
	}return sonuc;
}
	}


