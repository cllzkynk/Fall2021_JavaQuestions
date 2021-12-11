package bolum02 ;

public class ArtirmaAzaltmaOperatoru {
	public static void main(String[] args) {
		int i = 3; // final int i = 3; dersek i ye art�k yeni de�er atanamaz.
		int j = 3;
		i++;
		j--;
		System.out.println(i);

		System.out.println(j);

		i = 3;
		j = 3;
		++i;
		--j;
		System.out.println(i);

		System.out.println(j);

		int var = 10;
		int a = var;

		System.out.println(a);

		var = 5;
		System.out.println(a);

		a = var++; // var ++ = a'ya var � ata,sonra var'� 1 art�r demek.
		System.out.println(a);
		System.out.println(var);

		int b = 2;
		int var2 = 5;

		b = ++var2;// ++var2 = b' ye var2+1 i ata,sonra var2'y� 1 art�r demek.
		System.out.println(b);
		System.out.println(var2);

		i = 5;
		i = ++i + i++ + ++i + ++i;
		System.out.println("i = " + i);

	}

}
