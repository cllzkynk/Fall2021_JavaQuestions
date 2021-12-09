package days04;

public class Question02 {
	
	/*
     * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
     *
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */
	

	public static void main(String[] args) {
		
		int array[]= {1,2,3,4,5,6,7,23};
		
		System.out.println(ortalamaBul(array));
	}
	
	public static double ortalamaBul(int array[]) {
		
		double ortalama=0;
		double toplam=0;
		
		for(int each:array) {
			toplam+=each;
			ortalama=toplam/array.length;
			
		}
		return ortalama;//double ortalama =arr[i]  -->ortalama+=arr[i];	}
	}
}
