package recursive;

public class AsalMi {

	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			asalkontrol(i); // istersen fordan cik tek sayi gonder onu kontrol et
		}
		

	}
	public static void asalkontrol(int sayi)
    {
        int aklimda = 0;
        if (sayi == 0 || sayi == 1)
        {
        	System.out.println(sayi +"===>  En k���k asal say� 2 dir.");
        }
        else
        {
            for (int i = 2; i < (sayi / 2) + 1; i++)
            {
                if (sayi % i == 0)
                {
                    aklimda++;
                }

            }
            if (aklimda >= 1)
            {
            	System.out.println(sayi +"===>  Girilen  say�s� Asal say� de�ildir.");
            }
            else
            {
            	System.out.println(sayi +"===>  Girilen   say�s� Asal say�d�r.");
            }
        }


    }
}
