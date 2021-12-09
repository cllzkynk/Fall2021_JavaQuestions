package JavaKonusalSorular.ForLoop;



public class C08 {

	public static void main(String[] args) {
		/* Soru 8
		 * 'a' ile 'z' arasindaki karakterlerin ascii degerlerini yazdiran bir Java
		 * programi yazin.
		 * 
		 * Ascii value of a = 97 
		 * Ascii value of b = 98 
		 * Ascii value of c = 99 
		 * .
		 * .
		 * .
		 * Ascii value of z = 122
	
		 */
		
		// 1. yol
		for (int i = 97; i < 123; i++) {

			System.out.print("Ascii value of " + (char) i + " = " + i + "\n");
		}
		
		/*
		// 2. yol
		char c1 = 'a';    
		char c2 = 'z';
		
		for(int i=(char)c1;i<=(char)c2;i++)	{
			for(char j=c1 ; j<=c2; j++)		{
			if(i==j)		{
			System.out.println("Ascii value of "+j+" = "+i);
			}
			}
		}
		
		// 3. yol
		for (int i = 97; i <123; i++) {
			 char harf = (char) i;
			System.out.println("Ascii value of "+harf+" = "+i);
		}
		
		// 4. yol
		char ch = 'a';    
		Scanner sc=new Scanner(System.in);
				System.out.println("***Bu Program  ASCII degerlerini harf karsiligi ile verir***");
				System.out.println("Lutfen 1. Karekteri giriniz");
				char ch1=sc.nextLine().charAt(0);
				System.out.println("Lutfen 2. Karekteri giriniz");
				char ch2=sc.nextLine().charAt(0);
				
				
				for(int i=(char)ch1;i<=(char)ch2;i++)	{
				for(char j=ch1;j<=ch2;j++)		{
				if(i==j)		{
				System.out.println("ASCII value of "+j+" = "+i);
				}
				}
				}
*/
	}
}
