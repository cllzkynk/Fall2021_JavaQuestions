package Random_;

 
import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kontrol icin sayi gir");
		int num = scan.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Asal degil" : "Asal");
	scan.close();}

}
