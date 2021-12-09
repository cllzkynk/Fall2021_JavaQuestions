package InterviewSorulari;

public class Java_12_Positive_and_NegativeNumber {

	public static void main(String[] args) {

		// Pozitif ve negatif sayi

		double number = 0;

		if (number < 0.0) {
			System.out.println(number + " is negative number");
		} else if (number > 0.0) {
			System.out.println(number + " is positive number");
		} else {
			System.out.println(number + " is zero");
		}

	}
	
	/* 2. yol do While ile
	 
	 	Scanner scan= new Scanner(System.in);
	
	
	String devamMi="";
	do {
		System.out.println("Lutfen sayi giriniz");
		double num = scan.nextDouble();
			if(num < 0) {
			System.out.println(num + " negatifir");
		}
		else if(num > 0) {
			System.out.println(num + " pozitiftir");
		}
		else {
			System.out.println(num + " ne pozitif ne negatiftir ");
		}
		System.out.println("Yeni bir sayi girmek ister misiniz? (e/h)");
		devamMi = scan.next();
	} while (devamMi.equalsIgnoreCase("e"));
	System.out.println("Kod bitti");
	 */

}
