package Random_;

public class ProjectTask6 {

	public static void main(String[] args) {
		int[][] nums = { { 3, 6, 1 }, { 8, 8, 56 }, { 755, 998, 1 } };
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];

			}
		}
		System.out.println(sum);

		for (int[] array : nums) {
			for (int numbers : array) {
				sum += numbers;

			}
		}
		System.out.println(sum);
	}
}