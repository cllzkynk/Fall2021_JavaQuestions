package lambda;

 
import java.util.Arrays;
import java.util.List;

public class Lambda_1 {
interface lambda{
	int calistir(int x);
}
	public static void main(String[] args) {
		
		
		
		
		lambda l= x-> x*x ;
		System.out.println(l.calistir(5));
		
		
		List<Integer> list=  Arrays.asList(1,2,3);
		System.out.println(list);
		list.forEach(x-> System.out.println(x));
	}
}
