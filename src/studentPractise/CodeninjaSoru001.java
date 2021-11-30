package studentPractise;

import java.util.Arrays;

public class CodeninjaSoru001 {
public static void main(String[] args) {
	String [] strs= {"A","B"};
	int idx=0;
	
	
	for (String s : strs) {
		System.out.println("For icin atama oncesi===>"+Arrays.toString(strs));
		s.concat(" element ");
		System.out.println("For icin atama sonrasi===>"+Arrays.toString(strs));
		System.out.println(strs[idx]);
		idx++;
		
	}
	System.out.println(idx);
	System.out.println("For  disi===>"+Arrays.toString(strs));
	for (idx = 0;  idx< strs.length; idx++) {
		System.out.println(strs[idx]);
	}
}
}
