package InterviewSorulari;

public class Java_21_ReverseStringForLoop {

	static String str = "Reverse String";
	static String reverse= "";

	public static void main(String[] args) {

			yol1();

			yol2();

			yol3();

			yol4();

		}

	private static void yol4() {
		String str = "Reverse String";
		String reverse= "";

		for(int i = str.length()-1; i >=0; i--) {
			reverse += str.charAt(i);

		}
		System.out.println(reverse);
	}


	private static void yol3() {
			StringBuilder sb= new StringBuilder("Reverse String");
			System.out.println(sb.reverse());

		}

		private static void yol2() {
			String arr[] =str.split("");
			//System.out.println(Arrays.toString(arr));
			for (int i = arr.length-1; i >=0 ; i--) {
				System.out.print(arr[i]);

			}
			System.out.println();
		}

		private static void yol1() {


			for (int i = str.length()-1; i >=0 ; i--) {
				reverse+=str.charAt(i);
			}
			System.out.println("String`in tersi : " + reverse);
		}

	}