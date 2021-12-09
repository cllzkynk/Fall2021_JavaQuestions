package InterviewSorulari;

public class Java_28_PrimeNumberInterval {

	public static void main(String[] args) {

		// PrimeNumberInterval(asal sayi araligi )
		// Araliktaki asal sayilari bulalim...


			int low = 20, high = 50;


			while (low < high) {
				boolean flag = false;

				for(int i = 2; i <= low/2; ++i) {
					// condition for nonprime number
					// asal olmayan sayı koşulu
					if(low % i == 0) {
						flag = true;
						break;
					}
				}

				if (!flag && low != 0 && low != 1)
					System.out.print(low + " ");

				++low;
			}
		}


	}

