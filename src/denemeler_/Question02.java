package day02;

//1 den 100 e kadar olan sayilarin 3'e 5'e ve 15' bolunen sayilari yazdiralim.
// 3 e bolunen sayilar: 3 6 9 12 ----
//5 e bolunen sayilar:5 10 15 20 --
// 15 e bolunen sayilar: 15 30 45 60---

public class Question02 {

	public static void main(String[] args) {
		
		for(int i = 100; i>0; i--){
			if(i%15==0){
				System.out.println(i + " bu sayi 15'e tam bolunebiliyo");
			}else if(i%5==0){
				System.out.println(i + " bu sayi 5'e tam bolunebiliyor");
			}else if(i%3==0){
				System.out.println(i + " bu sayi 3'e tam bolunebiliyor");
			}else{
				System.out.println(i + " bu sayi 3'e 5'e ve ikisine tam bolunemiyor");
			}
		}
		

	}

}