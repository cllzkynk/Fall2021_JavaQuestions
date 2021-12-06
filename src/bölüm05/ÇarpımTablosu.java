package bölüm05;

public class ÇarpımTablosu {

	public static void main(String[] args) {
		System.out.println("\t\t\t\tÇarpım tablosu");
		for (int i = 1; i < 10; i++) {
			System.out.print("\t " + i);
			
		}
		System.out.println("\n---------------------------------------------------------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("\t%2d", i * j);//Sağa dayamak için yazıldı ama tam anlamadım.
			}
			System.out.println();
			
		}
         
	}

}
