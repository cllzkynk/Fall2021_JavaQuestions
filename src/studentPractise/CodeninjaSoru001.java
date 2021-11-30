package studentPractise;

import java.util.Arrays;

public class CodeninjaSoru001 {
	public static void main(String[] args) {
		String[] strs = { "A", "B" };
		int idx = 0;

		for (String s : strs) {
            System.out.println(strs[idx]); 
            strs[idx].concat(" element " + idx);
			System.out.println(strs[idx]); 
			idx++;
			
		}

		System.out.println(idx);

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
